package CaseStudy.service.Person.Employee;

import CaseStudy.model.Person.Employee;
import CaseStudy.service.Service;

import java.util.List;

public interface EmployeeService extends Service<Employee, List<Employee>> {
    String setProfessional();
    String setPosition();
}
