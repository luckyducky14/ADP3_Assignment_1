/* Participant interface
Author: Mpilonhle Zimela Mzimela (2301978833)
Date: 25/03/2025
 */


package repository;

import java.util.Optional;

public interface IParticipantRepository<T, ID> {
    T create(T t);
    Optional<T> read(ID id);
    T update(T t);
    boolean delete(ID id);
}
