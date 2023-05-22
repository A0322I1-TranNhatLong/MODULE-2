package CaseStudy.service.Booking;

import CaseStudy.model.Booking.Booking;
import CaseStudy.model.Facility.Facility;
import CaseStudy.model.Person.Customer;
import CaseStudy.service.Service;

import java.time.LocalDate;
import java.util.Queue;
import java.util.Set;

public interface BookingService extends Service<Booking, Set<Booking>> {
    String getBookingCode();

    Customer getCustomer();

    Facility getFacility();

    LocalDate getDate(String dateType);

    Queue<Booking> findAllVillaHouse();
}
