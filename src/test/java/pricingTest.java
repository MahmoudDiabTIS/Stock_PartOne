import APIs.pricing;
import APIs.login;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class pricingTest {

    @Test
    public static void pricingHappyScenario(){

        pricing prc = new pricing();
        login loginApi = new login();

        Response res_login = loginApi.login("+966538772716", "1111");
        res_login.body().prettyPrint();
        String token = res_login.jsonPath().get("data.access_token");

        Response response = prc.priice(token);

        System.out.println(response.body().prettyPrint());
        System.out.println();

        response.then().statusCode(200);
    }
}
