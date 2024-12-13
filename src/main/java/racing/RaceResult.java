package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RaceResult {
    private Cars winner;

    public RaceResult(Cars cars) {
        List<Car> winners = new ArrayList<>();
        Car winner = new Car();
        for (Car car : cars.getCar()) {
            if (winner.getPosition() < car.getPosition()) {
                winner = car;
            }
        }

        for (Car car : cars.getCar()) {
            if (winner.isDuplicateWinner(car)){
                winners.add(car);
            }
        }
        this.winner = new Cars(winners);
    }

    public Cars getWinner() {
        return winner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceResult that = (RaceResult) o;
        return Objects.equals(winner, that.winner);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(winner);
    }

    @Override
    public String toString() {
        return "RaceResult{" +
                "winner=" + winner +
                '}';
    }
}
