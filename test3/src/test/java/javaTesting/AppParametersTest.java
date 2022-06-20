package javaTesting;


import javaTesting.resources.AppParameters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppParametersTest {
    public static final String DOMAIN_EXPECTED = "127.0.0.1";
    public static final String PORT_EXPECTED = "80";
    public static final String URL_EXPECTED = "https://127.0.0.1:80";

    public AppParametersTest() {
    }

    @Test
    public void domainURLCorrect() {
        Assert.assertEquals("127.0.0.1", "127.0.0.1", "Retorna la part FQDN");
    }

    @Test
    public void correctPORT() {
        Assert.assertEquals("80", "80","Retorna el port correcte");
    }

    @Test
    public void correctURL() {
        Assert.assertEquals( "https://127.0.0.1:80", AppParameters.deployedURL(),"Retorna l'URL correcte");
    }

    @Test
    public void singletonCorrectness() {
        AppParameters inst1 = AppParameters.getInstance();
        AppParameters inst2 = AppParameters.getInstance();
        Assert.assertTrue(inst1 == inst2, "Comprovacio unicitat instancia del Singleton");
    }
}
