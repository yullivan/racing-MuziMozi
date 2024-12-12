package racing;

public class Application {

    public static void main(String[] args) {

        RaceController raceController = new RaceController(InputHandler.getUserCarsInput(), InputHandler.getUserRoundInput());
        System.out.println();

        raceController.playRace();

        RaceResult raceResult = new RaceResult(raceController.getCars());

        OutputHandler.printWinners(raceResult);
    }

}
