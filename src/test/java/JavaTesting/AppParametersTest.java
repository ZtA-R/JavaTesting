package JavaTesting;

import JavaTesting.Resources.AppParameters;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppParametersTest {
    public static final String DOMAIN_EXPECTD = "127.0.0.1";

    public static final String PORT_EXPECTD = "80";

    public static final String URL_EXPECTD = "https://" + DOMAIN_EXPECTD + ":" + PORT_EXPECTD;

    @Test
    public void domainURLCorrect(){

        Assert.assertEquals( "Retorna la part FQDN", DOMAIN_EXPECTD , AppParameters.DOMAIN );
    }

    @Test
    public void correctPORT (){

        Assert.assertEquals("Retorna el port correcte", PORT_EXPECTD, AppParameters.PORT);
    }

    @Test
    public void correctURL (){

        Assert.assertEquals("Retorna la url de forma correcte", URL_EXPECTD, AppParameters.deployedURL() );
    }

    @Test
    public void singletonCorrectness(){
        AppParameters inst1 = AppParameters.getInstance();

        AppParameters inst2 = AppParameters.getInstance();

        Assert.assertTrue("Comprovacio unicitat instancia del singleton", (inst1 == inst2 ));
    }
}
