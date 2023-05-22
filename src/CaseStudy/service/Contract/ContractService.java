package CaseStudy.service.Contract;

import CaseStudy.model.Booking.Contract;
import CaseStudy.service.Service;

import java.util.Set;

public interface ContractService extends Service<Contract, Set<Contract>> {
    void disPlayAll();

    String getContractNumber();

    double getMoney(String moneyType);
}
