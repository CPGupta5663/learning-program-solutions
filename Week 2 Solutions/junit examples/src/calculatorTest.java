import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatorTest {

    @Test
    public void testAdd() {
        calculator c = new calculator();
        assertEquals(10, c.add(5, 5));
    }
}

