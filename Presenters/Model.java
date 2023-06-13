package Presenters;

import java.util.Collection;
import java.util.Date;

import Models.Table;

public interface Model {
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

 /**
     * Изменение бронирования столика
     * 
     * @param oldReservation  старый ID бронирования для удаления
     * @param reservationDate новая дата бронирования
     * @param tableNo         новый номер стола
     * @param name            имя клиента
     * @return новый номер брони
     */
    static int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'changeReservationTable'");
}
    

}

