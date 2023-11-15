import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    @Test
    void stringLength() {
        Integer result = testing.stringLength("Ciao");
        assertEquals(4,result,"result = 4");
    }

    @Test
    void stringLengthZero(){
        Integer result = testing.stringLength("");
        assertEquals(0,result,"Empty string, result = 0");
    }

    @Test
    void stringLengthNull(){
        Integer result = testing.stringLength(null);
        assertEquals(null, result, "string value null, result = null");
    }
}