package racing;

public class RaceController {
    private Cars cars;
    private int round;

    public RaceController(Cars cars, int round) {
        this.cars = cars;
        this.round = round;
    }

    public Cars getCars() {
        return cars;
    }

    public int getRound() {
        return round;
    }

    private boolean isPossibleToStart() {
        return this.cars.getCar().size() > 1;
    }

    public void playRace() {
        while (round-- != 0) {
            if (!isPossibleToStart()) {
                OutputHandler.printCannotStartGame();
                break;
            }
            for (Car car : this.cars.getCar()) {
                car.move(RandomGenerator.generateRandomNumber());
            }
            OutputHandler.printCarsState(cars);
        }
    }
}
