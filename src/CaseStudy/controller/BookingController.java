package CaseStudy.controller;

import CaseStudy.service.Booking.BookingService;
import CaseStudy.service.Booking.BookingServiceImpl;
import CaseStudy.service.Contract.ContractService;
import CaseStudy.service.Contract.ContractServiceImpl;

import java.util.Scanner;

public class BookingController {
    public BookingController() {
    }

    public void disPlayMainMenu() {
        Scanner input = new Scanner(System.in);
        BookingService bookingService = new BookingServiceImpl();
        ContractService contractService = new ContractServiceImpl() {
            @Override
            public void displayAll() {

            }
        };
        while (true) {
            try {
                System.out.println("---- Booking Management ----");
                System.out.println("1. Add new booking");
                System.out.println("2. Display list booking");
                System.out.println("3. Create new contracts");
                System.out.println("4. Display list contracts");
                System.out.println("5. Edit contracts");
                System.out.println("6. Return main menu");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        bookingService.add();
                        break;
                    case 2:
                        bookingService.displayAll();
                        break;
                    case 3:
                        contractService.add();
                        break;
                    case 4:
                        contractService.displayAll();
                        break;
                    case 5:
                        contractService.set();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Your choice must be from 1 to 6!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
    }
}