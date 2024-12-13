package racing;

public class OutputHandler {

    public static void printRaceRound(int round) {
        System.out.println("(" + round + ")");
    }

    public static void printCarsState(Cars cars) {
        for (Car car : cars.getCar()) {
            System.out.println(car);
        }
    }

    public static void printWinners(RaceResult raceResult) {
        for (Car car : raceResult.getWinner().getCar()) {
            System.out.println("\uD83C\uDFC6우승자는 " + car.getCarName() + "!");
        }
    }
}
