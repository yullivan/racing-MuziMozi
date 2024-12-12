package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void carMoveTest() {
        Car c1 = new Car("현대");
        assertThat(c1.getPosition()).isEqualTo(0);
        c1.move();
        assertThat(c1.getPosition()).isEqualTo(1);
    }
}
