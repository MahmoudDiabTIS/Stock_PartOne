import APIs.Qty;
import APIs.Login;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class qtyTest {

    @Test
    public static void qtyHappyScenario(){
        Qty qqty = new Qty();
        Login loginApi = new Login();

        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = qqty.qty(token);
        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
