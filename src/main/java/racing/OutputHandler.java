package racing;

public class OutputHandler {

    public static void printCannotStartGame() {
        System.out.println("자동차 경주를 시작하려면 최소 2대 이상의 자동차가 필요합니다!");
    }

    public static void printCarsState(Cars cars) {
        System.out.println(cars);
    }
}
