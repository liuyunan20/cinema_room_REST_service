package cinema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Seat {
    @JsonProperty("row")
    private int row;
    @JsonProperty("column")
    private int column;

    public Seat() {}

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
