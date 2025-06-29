import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcAAATest {

    private CalcAAA calculator;

    // Setup method runs before every test
    @Before
    public void setUp() {
        calculator = new CalcAAA();
        System.out.println(" Setup: New CalcAAA instance created");
    }

    // Teardown method runs after every test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println(" Teardown: CalcAAA instance cleared");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10, b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals("Addition result should be 15", 15, result);
    }

    @Test
    public void testDivision() {
        // Arrange
        int a = 20, b = 4;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals("Division result should be 5", 5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        // Arrange
        int a = 10, b = 0;

        // Act & Assert (Exception expected)
        calculator.divide(a, b);
    }
}
