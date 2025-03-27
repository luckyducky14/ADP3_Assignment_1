/* Participant repository test class
Author: Mpilonhle Zimela Mzimela (2301978833)
Date: 25/03/2025
 */



package  repository;
import domain.Participant;
import repository.impl.ParticipantRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ParticipantRepositoryTest {
    private final ParticipantRepository repository = new ParticipantRepository();

    @Test
    public void testCreateParticipant() {
        Participant participant = new Participant.Builder()
                .participantID("P005")
                .name("Anele Zulu")
                .email("anele@example.com")
                .build();
        repository.create(participant);

        assertNotNull(participant);
        assertEquals("P005", participant.getParticipantID());
    }

    @Test
    public void testReadParticipant() {
        Participant participant = new Participant.Builder()
                .participantID("P005")
                .name("Anele Zulu")
                .email("anele@example.com")
                .build();
        repository.create(participant);

        Optional<Participant> readParticipant = repository.read("P005");
        assertTrue(readParticipant.isPresent());
        assertEquals("Anele Zulu", readParticipant.get().getName());
    }

    @Test
    public void testUpdateParticipant() {
        Participant participant = new Participant.Builder()
                .participantID("P005")
                .name("Anele Zulu")
                .email("anele@example.com")
                .build();
        repository.create(participant);

        Participant updatedParticipant = new Participant.Builder()
                .participantID("P005")
                .name("Anlee Zulu")
                .email("anele@example.com")
                .build();
        repository.update(updatedParticipant);

        Optional<Participant> readParticipant = repository.read("P005");
        assertTrue(readParticipant.isPresent());
        assertEquals("Anele Zulu", readParticipant.get().getName());
    }
    @Test
    public void testDeleteParticipant() {
        Participant participant = new Participant.Builder()
                .participantID("P005")
                .name("Anele Zulu")
                .email("anele@example.com")
                .build();
        repository.create(participant);

        assertTrue(repository.delete("P005"));
        assertFalse(repository.read("P005").isPresent());
    }
}
