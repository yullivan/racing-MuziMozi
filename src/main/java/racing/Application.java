package racing;

public class Application {

    public static void main(String[] args) {

        RaceController raceController = new RaceController(InputHandler.getUserCarsInput(), 5);
        raceController.playRace();
        System.out.println(raceController.getCars().getCar().toString());
    }

}
