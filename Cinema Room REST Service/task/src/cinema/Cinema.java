package cinema;

import java.util.List;
public class Cinema {
    private int totalRows;
    private int totalColumns;

    private List<Seat> availableSeats;

    public Cinema() {};

    public Cinema(int totalRows, int totalColumns) {
        this.totalRows = totalRows;
        this.totalColumns = totalColumns;
    }
}
