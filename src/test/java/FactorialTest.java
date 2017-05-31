import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class FactorialTest {
    private Factorial factorial;

    @Before
    public void init(){factorial = new Factorial();}
    @After
    public void reset() { factorial = null; }

    @Test
    public void factorialTrue() {
        assertTrue(factorial.factor(0) == 1);
        assertTrue(factorial.factor(1) == 1);
        assertTrue(factorial.factor(5) == 120);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegativ(){
        factorial.factor(-2);
    }

    @Test
    public void factorialNeNull(){
        assertNotNull(new Factorial());
    }

}
