package domain;

public class Ticket {
    private int ticketId;
    private int eventId;
    private String participantId;
    private double price;

    private Ticket(Builder builder) {
        this.ticketId = builder.ticketId;
        this.eventId = builder.eventId;
        this.participantId = builder.participantId;
        this.price = builder.price;
    }

    public int getTicketId() {
        return ticketId;
    }

    public int getEventId() {
        return eventId;
    }

    public String getParticipantId() {
        return participantId;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", eventId=" + eventId +
                ", participantId='" + participantId + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private int ticketId;
        private int eventId;
        private String participantId;
        private double price;

        public Builder setTicketId(int ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        public Builder setEventId(int eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setParticipantId(String participantId) {
            this.participantId = participantId;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}
