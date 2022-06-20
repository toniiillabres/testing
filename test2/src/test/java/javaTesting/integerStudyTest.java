package javaTesting;



import org.testng.Assert;
import org.testng.annotations.Test;



public class integerStudyTest {







    @Test
    public void WorkWithClassesTest() {
        new Integer(8);
        Integer vint = new Integer(20);
        Integer treze = 13;
        int esperat = 13;
        Assert.assertEquals((long)esperat, (long)treze, "tretze val 13");
        Assert.assertEquals(20L, (long) vint, "El nombre vint val 20");
    }

    @Test
    public void WorkWithClassesComp() {
        Integer vuit = new Integer(8);
        Integer eight = new Integer(8);
        Assert.assertEquals(8L, (long)vuit, "El nombre vuit val 8");
        Assert.assertEquals( 8L, (long)eight, "El nombre eight val 8");
        Assert.assertTrue(vuit.equals(eight));
    }

    @Test
    public void WorkWithClassesBinaryTest() {
        Integer dos = new Integer(2);
        new Integer(20);
        Integer treze = 13;
        String tipusPersones = "Hi ha " + Integer.toBinaryString(dos) + " de persones que entenen el binari i el que NO";
        Assert.assertEquals( 2L, (long)dos, tipusPersones);
    }
}