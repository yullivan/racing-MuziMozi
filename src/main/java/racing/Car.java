package racing;

import java.util.Objects;

public class Car {
    private String carName;
    private int position;

    public Car() {
        this.position = 0;
    }

    public Car(String carName) {
        if (carName.length() > 10) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 10자 내외로 작성해주세요!");
        }
        this.carName = carName;
        this.position = 0;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    private boolean isMove(int randomNumber) {
        return randomNumber != 1 && randomNumber != 2;
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
        return "Car{" +
                "carName='" + carName + '\'' +
                ", position=" + position +
                '}';
    }
}
