package racing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void moveCarsTest() {
        Car c1 = new Car("현대");
        Car c2 = new Car("도요타");
        Car c3 = new Car("테슬라");
        Cars cars = new Cars(List.of(c1, c2, c3));

        cars.getCar().get(0).move(3);
        cars.getCar().get(1).move(1);
        cars.getCar().get(2).move(2);
        assertThat(cars.getWinner()).isEqualTo(List.of(cars.getCar().get(0)));
    }

    @Test
    void winnerDupicationTest() {
        Car c1 = new Car("현대");
        Car c2 = new Car("도요타");
        Car c3 = new Car("테슬라");
        Cars cars = new Cars(List.of(c1, c2, c3));

        cars.getCar().get(0).move(3);
        cars.getCar().get(1).move(5);
        cars.getCar().get(2).move(2);
        assertThat(cars.getWinner()).isEqualTo(List.of(cars.getCar().get(0), cars.getCar().get(1)));
    }

    @Test
    void winnerDupicationTest2() {
        Car c1 = new Car("현대");
        Car c2 = new Car("도요타");
        Car c3 = new Car("테슬라");
        Cars cars = new Cars(List.of(c1, c2, c3));

        cars.getCar().get(0).move(1);
        cars.getCar().get(1).move(1);
        cars.getCar().get(2).move(2);
        assertThat(cars.getWinner()).isEqualTo(List.of(cars.getCar().get(0), cars.getCar().get(1), cars.getCar().get(2)));
    }
}
