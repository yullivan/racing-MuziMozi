package racing;

public class RaceController {
    private Cars cars;
    private int rounds;

    final int MIN_CARS = 2;
    final int MIN_ROUND = 1;
    final int RACE_OVER = 0;

    public RaceController(Cars cars, int rounds) {
        if (cars.getCar().size() < MIN_CARS) {
            throw new IllegalArgumentException("[ERROR] 레이스를 진행하려면 최소 2대 이상의 자동차가 필요합니다!");
        }
        if (rounds < MIN_ROUND) {
            throw new IllegalArgumentException("[ERROR] 진행 라운드 수가 1보다 작습니다!");
        }
        this.cars = cars;
        this.rounds = rounds;
    }

    public Cars getCars() {
        return cars;
    }

    public int getRounds() {
        return rounds;
    }

    public RaceResult playRace() {
        int round = 1;
        while (rounds-- != RACE_OVER) {
            OutputHandler.printRaceRound(round);
            for (Car car : this.cars.getCar()) {
                car.move(RandomGenerator.generateRandomNumber());
            }
            OutputHandler.printCarsState(cars);
            System.out.println();
            round++;
        }
        return new RaceResult(this.getCars());
    }
}
