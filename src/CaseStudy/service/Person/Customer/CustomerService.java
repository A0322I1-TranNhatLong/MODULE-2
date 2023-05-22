package CaseStudy.service.Person.Customer;

import CaseStudy.model.Person.Customer;
import CaseStudy.service.Service;

import java.util.List;

public interface CustomerService extends Service<Customer, List<Customer>> {
    String getCustomerType();
}
