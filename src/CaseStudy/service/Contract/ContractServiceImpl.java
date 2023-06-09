package CaseStudy.service.Contract;

import CaseStudy.model.Booking.Booking;
import CaseStudy.model.Booking.Contract;
import CaseStudy.repository.Contract.ContractRepository;
import CaseStudy.repository.Contract.ContractRepositoryImpl;
import CaseStudy.service.Booking.BookingService;
import CaseStudy.service.Booking.BookingServiceImpl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public abstract class ContractServiceImpl implements ContractService {
    private static final ContractRepository CONTRACT_REPOSITORY;

    static {
        CONTRACT_REPOSITORY = new ContractRepositoryImpl();
    }

    public ContractServiceImpl() {
    }
    @Override
    public void add() {
        BookingService bookingService = new BookingServiceImpl();
        Queue<Booking> villaHouseBookings = bookingService.findAllVillaHouse();
        Set<Contract> contracts = CONTRACT_REPOSITORY.read();
        Queue<Booking> bookings = new LinkedList<>();
        for (Booking booking : villaHouseBookings) {
            for (Contract contract : contracts) {
                if (!booking.getBookingCode().equals(contract.getBookingCode())) {
                    bookings.offer(booking);
                }
            }
        }
        Booking nearestBooking;
        if (bookings.size() == 0) {
            System.out.println("There are not booking need create contract!");
        } else {
            while ((nearestBooking = bookings.poll()) != null) {
                System.out.println("Create contract for: " + nearestBooking);
                String contractNumber = getContractNumber();
                double deposits = getMoney("deposits");
                double totalBill = getMoney("total bill");
                CONTRACT_REPOSITORY.add(new Contract(contractNumber, nearestBooking.getBookingCode(), deposits, totalBill, nearestBooking.getCustomerCode()));
            }
        }
    }

    @Override
    public void disPlayAll() {
        CONTRACT_REPOSITORY.displayAll();
    }

    @Override
    public String getContractNumber() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter contract number: ");
            String contractNumber = input.nextLine();
            Contract contract = find(contractNumber);
            if (contract != null) {
                return contractNumber;
            }
            System.out.println("Your contract number is exist!");
        }
    }

    @Override
    public double getMoney(String moneyType) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a " + moneyType + ": ");
                double money = Double.parseDouble(input.nextLine());
                if (money > 0) {
                    return money;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
    }

    @Override
    public void set() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose contract number to edit: ");
        displayAll();
        System.out.println("Enter your choice: ");
        String contractNumber = input.nextLine();
        Contract contract = find(contractNumber);
        if (contract != null) {
            System.out.println("Contract before edit: " + contract);
            contract.setContractNumber(getContractNumber());
            contract.setDeposits(getMoney("new deposits"));
            contract.setTotalBill(getMoney("new total bill"));
            System.out.println("Contract after edit: " + contract);
            CONTRACT_REPOSITORY.set(contract);
        } else {
            System.out.println("Contract number is not exist!");
        }
    }

    @Override
    public Contract find(String code) {
        return CONTRACT_REPOSITORY.find(code);
    }

    @Override
    public Set<Contract> findAll() {
        return CONTRACT_REPOSITORY.read();
    }
}
