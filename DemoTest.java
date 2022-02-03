import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    @Test
    public void Test1() {
        assertEquals("Hello", Demo.str("Hello")); // failed test
    }

}