import java.util.Random;

public class Ticket {
    String numSeat;
    int personalNumber;

    public Ticket(String SeatNumber ) {
        Random random = new Random();
        this.personalNumber = random.nextInt(1000, 10000);
        this.numSeat = SeatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numSeat='" + numSeat + '\'' +
                ", personalNumber=" + personalNumber +
                '}';
    }
}