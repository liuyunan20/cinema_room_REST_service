package cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @RestController
    public class TaskController {
        private Cinema cinema = new Cinema(9, 9);
        @GetMapping("/seats")
        public Cinema getCinema() {
            return cinema;
        }
    }
}

