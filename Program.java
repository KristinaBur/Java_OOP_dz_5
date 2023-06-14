import java.util.Date;

import Models.TableModel;
import Presenters.BookingPresenter;
import Presenters.Model;
import Views.BookingView;


public class Program {

    /**
     * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     *
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()
        bookingView.reservationTable(new Date(), 1103, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        //bookingView.changeReservationTable();
        System.out.println("-------------------------------------------");

        bookingView.changeReservationTable(9001, new Date(), 101, "Станислав");

        System.out.println("-------------------------------------------");
        bookingView.changeReservationTable(9001, new Date(), 104, "Станислав");
    }

}