package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Presenters.Model;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить все столики
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null)
        {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    /**
     * TODO: Разработать самостоятельно в рамках домашней работы
     * Поменять бронь столика
     * 
     * @param oldReservation  номер старого резерва (для снятия)
     * @param reservationDate дата резерва столика
     * @param tableNo         номер столика
     * @param name            Имя
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            for (Reservation reserv : table.getReservations()) {
                if (reserv.getId() == oldReservation) {
                    table.getReservations().remove(reserv);
                    break;
                }
            }
        }
        return reservationTable(reservationDate, tableNo, name);
        //...
        //TODO: Для создания новой брони, можно воспользоваться уже существующим методом reservationTable
    }

}