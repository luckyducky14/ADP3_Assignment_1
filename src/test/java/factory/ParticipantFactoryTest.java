/* Participant factory test class
Author: Mpilonhle Zimela Mzimela (2301978833)
Date: 25/03/2025
 */



package factory;
import domain.Participant;
import factory.ParticipantFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParticipantFactoryTest {
    @Test
    public void testCreateParticipant() {
        Participant participant = ParticipantFactory.createParticipant("P001", "Johnny Smith", "john.doe@example.com");
        assertNotNull(participant);
        assertEquals("P001", participant.getParticipantID());
        assertEquals("Johnny Smith", participant.getName());
        assertEquals("johnnyS@example.com", participant.getEmail());
    }
    @Test
    public void testCreateParticipantWithInvalidData() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ParticipantFactory.createParticipant(null, "Johnny Smith", "johnnys@example.com");
        });
        assertEquals("All fields must be provided!", exception.getMessage());
    }
}
