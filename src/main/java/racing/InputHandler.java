package racing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    public static Cars getUserCarsInput() {
        while (true) {
            try {
                System.out.println("레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요.");
                System.out.print(": ");
                Scanner scanner = new Scanner(System.in);
                String cars = scanner.nextLine();
                List<Car> tmpCarsList = Arrays.stream(cars.split("\\s*,\\s*"))
                        .map((car) -> {
                            return new Car(car);
                        })
                        .toList();

                return new Cars(tmpCarsList);
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 형식입니다!");
            }
        }

    }
}
