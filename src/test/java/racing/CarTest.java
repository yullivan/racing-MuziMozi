package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void carMoveTest() {
        Car c1 = new Car("현대");
        assertThat(c1.getPosition()).isEqualTo(0);
        c1.move(3);
        c1.move(1);
        c1.move(2);
        assertThat(c1.getPosition()).isEqualTo(1);
    }
}
