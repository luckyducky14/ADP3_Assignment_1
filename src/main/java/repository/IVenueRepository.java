package repository;
/* IVenueRepository.java
   Author: Thimna Gogwana (222213973)
   Date: 26 March 2025
*/
import domain.Venue;

import java.util.List;

public interface IVenueRepository {
    void addVenue(Venue venue);
    Venue getVenue(String venueID);
    List<Venue> getAllVenues();
    void updateVenue(Venue venue);
    void deleteVenue(String venueID);
}