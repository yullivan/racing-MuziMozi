package racing;

import java.util.Objects;

public class Car {
    private String carName;
    private int position;

    final int START_POSITION = 0;
    final int MAX_NAME_LENGTH = 10;
    final int STOP_NUMBER_1 = 1;
    final int STOP_NUMBER_2 = 2;

    public Car() {
        this.position = START_POSITION;
    }

    public Car(String carName) {
        if (carName.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 10자 내외로 작성해주세요!");
        }
        this.carName = carName;
        this.position = START_POSITION;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    private boolean isMove(int randomNumber) {
        return randomNumber != STOP_NUMBER_1 && randomNumber != STOP_NUMBER_2;
    }

    public void move(int randomNumber) {
        if (isMove(randomNumber)) {
            this.position++;
        }
    }

    public boolean isDuplicateWinner(Car other) {
        return this.getPosition() == other.getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, position);
    }

    @Override
    public String toString() {
        return carName + " \uD83C\uDFCE\uFE0F" + "-".repeat(position);
    }
}
