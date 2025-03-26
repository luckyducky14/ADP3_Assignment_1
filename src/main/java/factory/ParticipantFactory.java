package factory;

import domain.Participant;

public class ParticipantFactory {
    public static Participant createParticipant(String participantID, String name, String email) {
        if (participantID == null || name == null || email == null || name.isEmpty() || email.isEmpty()) {
            throw new IllegalArgumentException("All fields must be provided!");
        }
        return new Participant.Builder()
                .participantID(participantID)
                .name(name)
                .email(email)
                .build();
    }
}
