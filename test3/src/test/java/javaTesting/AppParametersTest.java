package javaTesting;



import javaTesting.resources.AppParameters;
import org.junit.Assert;
import org.junit.Test;

public class AppParametersTest {
    public static final String DOMAIN_EXPECTED = "127.0.0.1";
    public static final String PORT_EXPECTED = "80";
    public static final String URL_EXPECTED = "https://127.0.0.1:80";

    public AppParametersTest() {
    }

    @Test
    public void domainURLCorrect() {
        Assert.assertEquals("Retorna la part FQDN", "127.0.0.1", "127.0.0.1");
    }

    @Test
    public void correctPORT() {
        Assert.assertEquals("Retorna el port correcte", "80", "80");
    }

    @Test
    public void correctURL() {
        Assert.assertEquals("Retorna l'URL correcte", "https://127.0.0.1:80", AppParameters.deployedURL());
    }

    @Test
    public void singletonCorrectness() {
        AppParameters inst1 = AppParameters.getInstance();
        AppParameters inst2 = AppParameters.getInstance();
        Assert.assertTrue("Comprovacio unicitat instancia del Singleton", inst1 == inst2);
    }
}
