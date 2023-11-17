import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    @Test
    void stringLength_withString() {
        Integer result = testing.stringLength("Ciao");
        assertEquals(4, result, "result = 4");
    }

    @Test
    void stringLength_with_char_and_numbers() {
        Integer result = testing.stringLength("erj8738oej**");
        assertEquals(12, result, "result = 4");
    }

    @Test
    void stringLengthZero() {
        Integer result = testing.stringLength("");
        assertEquals(0, result, "Empty string, result = 0");
    }

    @Test
    void stringLengthNull() {
        Integer result = testing.stringLength(null);
        assertNull(result, "string value null, result = null");
    }
}