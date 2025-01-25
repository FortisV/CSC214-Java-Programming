



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tester {
    @Test
    void greetingTest() {
        HelloWorld helloworld = new HelloWorld();
        assertNotNull(helloworld.greetingMessage());
    }
}
