package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCar() {
        return cars;
    }

    public void moveCars() {
        for (Car car : this.cars) {
            car.move(RandomGenerator.generateRandomNumber());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cars);
    }

    @Override
    public String toString() {
        return cars + "";
    }
}
