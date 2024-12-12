package racing;

public class RaceController {
    private Cars cars;
    private int rounds;

    public RaceController(Cars cars, int rounds) {
        if (cars.getCar().size() < 2) {
            throw new IllegalArgumentException("[ERROR] 레이스를 진행하려면 최소 2대 이상의 자동차가 필요합니다!");
        }
        if (rounds < 1) {
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

    public void playRace() {
        int round = 1;
        while (rounds-- != 0) {
            OutputHandler.printRaceRound(round);
            for (Car car : this.cars.getCar()) {
                car.move(RandomGenerator.generateRandomNumber());
            }
            OutputHandler.printCarsState(cars);
            System.out.println();
            round++;
        }
    }
}
