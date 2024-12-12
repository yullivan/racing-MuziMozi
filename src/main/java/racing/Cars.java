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

    public List<Car> getWinner() {
        List<Car> winners = new ArrayList<>();
        Car winner = new Car();
        for (Car car : this.cars) {
            if (winner.getPosition() < car.getPosition()) {
                winner = car;
            }
        }

        for (Car car : this.cars) {
            if (winner.isDuplicateWinner(car)){
                winners.add(car);
            }
        }
        return winners;
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
