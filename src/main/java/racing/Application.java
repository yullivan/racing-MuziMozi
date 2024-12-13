package racing;

public class Application {

    public static void main(String[] args) {

        RaceController raceController = new RaceController(InputHandler.getUserCarsInput(), InputHandler.getUserRoundInput());
        System.out.println();

        RaceResult raceResult = raceController.playRace();

        OutputHandler.printWinners(raceResult);
    }

}
