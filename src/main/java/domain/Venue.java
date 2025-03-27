package domain;

/* Venue.java
   Venue model class
   Author: Thimna Gogwana (222213973)
   Date: 24 March 2025
*/

public class Venue {
    private final String venueID; // Unique identifier for the venue
    private final String name;     // Name of the venue
    private final String address;  // Address of the venue


    public Venue() {
        this.venueID = "";
        this.name = "";
        this.address = "";
    }


    private Venue(Builder builder) {
        this.venueID = builder.venueID;
        this.name = builder.name;
        this.address = builder.address;
    }


    public String getVenueID() {
        return venueID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public static class Builder {
        private String venueID;
        private String name;
        private String address;

        public Builder venueID(String venueID) {
            this.venueID = venueID;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Venue build() {
            return new Venue(this);
        }
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueID='" + venueID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}