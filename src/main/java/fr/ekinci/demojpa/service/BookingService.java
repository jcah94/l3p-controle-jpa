package fr.ekinci.demojpa.service;

import fr.ekinci.demojpa.model.ReservationEntity;
import java.sql.SQLException;
import java.util.List;

public interface BookingService {
    ReservationEntity insert(ReservationEntity reservation) throws SQLException;
    void update(ReservationEntity reservation) throws SQLException;
    void delete(ReservationEntity reservation) throws SQLException;
    ReservationEntity select(ReservationEntity reservationEntity) throws SQLException;
    List<ReservationEntity> selectAll() throws SQLException;
}
