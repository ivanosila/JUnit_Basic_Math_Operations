import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ivan Osila on 29/11/2019
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicOperatorsTest {

    BasicOperators basicOperators = new BasicOperators();
    int result;
    int[] expected = { 9, 8, 48, 10 };
    int[] x = { 5, 10, 6, 20 };
    int[] y = { 4, 2, 8, 2 };

    @Test
    public void addition() {
        result = BasicOperators.addition(x[0], y[0]);
        assertEquals(expected[0], result);
    }

    @Test
    public void subtraction() {
        result = BasicOperators.subtraction(x[1], y[1]);
        assertEquals(expected[1], result);
    }

    @Test
    public void multiplication() {
        result = BasicOperators.multiplication(x[2], y[2]);
        assertEquals(expected[2], result);
    }

    @Test
    public void division() {
        result = BasicOperators.division(x[3], y[3]);
        assertEquals(expected[3], result);
    }
}