package javaTesting;



import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class SumTest {
    public SumTest() {
    }
    @Test
    public void SumTest() {

        int r = 1 + 1;

        assertEquals(2, r, "1 + 1 = 2");
    }
}
