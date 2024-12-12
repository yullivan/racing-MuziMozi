package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Application {

    public static void main(String[] args) {

        RaceController raceController = new RaceController(InputHandler.getUserCarsInput(), 5);
        raceController.playRace();
        System.out.println(raceController.cars.getCars().toString());
    }

}
