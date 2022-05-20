import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
Main main = new Main();

    @Test
    void abs() {
        assertEquals(-5, main.abs(5));
    }
}
