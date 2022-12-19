import APIs.Pricing;
import APIs.Login;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class pricingTest {

    @Test
    public static void pricingHappyScenario(){

        Pricing prc = new Pricing();
        Login loginApi = new Login();

        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = prc.pricing(token);
        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
