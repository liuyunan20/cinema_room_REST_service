package cinema.controller;

import cinema.Cinema;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private Cinema cinema = new Cinema(9, 9);
    @GetMapping("/seats")
    public Cinema getCinema() throws JsonProcessingException {
        return cinema;
    }
}
