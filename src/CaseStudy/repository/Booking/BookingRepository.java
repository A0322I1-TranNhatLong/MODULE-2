package CaseStudy.repository.Booking;

import CaseStudy.model.Booking.Booking;
import CaseStudy.repository.Repository;

import java.util.Queue;
import java.util.Set;

public interface BookingRepository extends Repository<Booking, Set<Booking>> {
    Queue<Booking> findAllVillaHouse();
}
