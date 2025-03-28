/* Ticket repository class
Author: Luvo Nana (221376909)
Date: 26/03/2025
 */

package repository;

import domain.Ticket;
import java.util.Set;

public interface ITicketRepository {
    static ITicketRepository getRepository() {
        return null;
    }

    Ticket create(Ticket ticket);
    Ticket read(int ticketId);
    Ticket update(Ticket ticket);
    boolean delete(int ticketId);
    Set<Ticket> getAll();
}

