package racing;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RaceControllerTest {
    @Test
    void playRaceTest() {
        Car c1 = new Car("현대");
        Car c2 = new Car("도요타");
        Car c3 = new Car("테슬라");
        Cars cars = new Cars(List.of(c1, c2, c3));
        RaceController raceController = new RaceController(cars, 5);
        raceController.playRace();
        System.out.println(raceController.getCars().getWinner());
    }
}
