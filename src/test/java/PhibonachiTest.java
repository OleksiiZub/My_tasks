import org.junit.After;
import org.junit.Before;

public class PhibonachiTest {
    private Phibonachi phibonachi;

    @Before
    public void init(){phibonachi = new Phibonachi();}
    @After
    public void reset() { phibonachi = null; }
}