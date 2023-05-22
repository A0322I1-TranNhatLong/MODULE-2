package CaseStudy.service.Facility;

import CaseStudy.model.Facility.Facility;
import CaseStudy.service.Service;

import java.util.Map;

public interface FacilityService extends Service<Facility, Map<Facility, Integer>> {
    void displayMaintenance();

    void increaseNumberOfUse(Facility facility);
}
