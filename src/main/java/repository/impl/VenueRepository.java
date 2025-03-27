package repository.impl;
/*VenueRepository.java
  Author: Thimna Gogwana (222213973)
  Date: 26 March 2025
*/
import domain.Venue;
import repository.IVenueRepository;

import java.util.ArrayList;
import java.util.List;

public class VenueRepository implements IVenueRepository {
    private final List<Venue> venueList = new ArrayList<>();

    @Override
    public void addVenue(Venue venue) {
        venueList.add(venue);
    }

    @Override
    public Venue getVenue(String venueID) {
        return venueList.stream()
                .filter(venue -> venue.getVenueID().equals(venueID))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Venue> getAllVenues() {
        return new ArrayList<>(venueList);
    }

    @Override
    public void updateVenue(Venue venue) {
        // Find the index of the venue to update
        for (int i = 0; i < venueList.size(); i++) {
            if (venueList.get(i).getVenueID().equals(venue.getVenueID())) {
                venueList.set(i, venue);
                return;
            }
        }
    }

    @Override
    public void deleteVenue(String venueID) {
        venueList.removeIf(venue -> venue.getVenueID().equals(venueID));
    }
}