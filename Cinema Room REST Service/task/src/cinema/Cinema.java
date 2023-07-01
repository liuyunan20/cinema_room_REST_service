package cinema;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Cinema {
    @JsonProperty("total_rows")
    private int totalRows;
    @JsonProperty("total_columns")
    private int totalColumns;
    @JsonProperty("available_seats")
    private List<Seat> availableSeats;

    public Cinema() {};

    public Cinema(int totalRows, int totalColumns) {
        this.totalRows = totalRows;
        this.totalColumns = totalColumns;
        List<Seat> seatList = new ArrayList<>();
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                Seat s = new Seat(i, j);
                seatList.add(s);
            }
        }
        this.availableSeats = seatList;
    }
}
