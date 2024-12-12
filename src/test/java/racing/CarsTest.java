package racing;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CarsTest {
    @Test
    void moveCarsTest() {
        Car c1 = new Car("현대");
        Car c2 = new Car("도요타");
        Car c3 = new Car("테슬라");
        Cars cars = new Cars(List.of(c1, c2, c3));
        for (int i = 0; i < 10; i++) {
            cars.moveCars();
            System.out.println(cars);
        }
        System.out.println(cars.getWinner().toString());
    }
}
