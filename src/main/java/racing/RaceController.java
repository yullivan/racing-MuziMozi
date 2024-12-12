package racing;

public class RaceController {
    Cars cars;
    int round;

    public RaceController(Cars cars, int round) {
        this.cars = cars;
        this.round = round;
    }

    private boolean isPossibleToStart() {
        return this.cars.getCars().size() > 1;
    }

    public void playRace() {
        while (round-- != 0) {
            if (!isPossibleToStart()) {
                OutputHandler.printCannotStartGame();
                break;
            }
            for (int i = 0; i < round; i++) {
                cars.moveCars();
                OutputHandler.printCarsState(cars);
            }
        }
    }
}
