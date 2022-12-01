public class Seat {
    String numSeat;
    boolean isRented;

    public Seat(String SeatNumber, boolean isRented) {
        this.numSeat = SeatNumber;
        this.isRented = isRented;
    }

    public Ticket booking() {

        if (this.isRented) {
            Ticket ticket = new Ticket(this.numSeat);
            System.out.println("Номер места " + this.numSeat + " - Забронирован." );
            return ticket;
        } else {
            System.out.println("Номер места " + this.numSeat + " - Свободен.");
            return null;
        }

    }

    @Override
    public String toString() {
        return "Seat{" +
                "numSeat=" + numSeat +
                ", isRented=" + isRented +
                '}';
    }
}