import APIs.login;
import APIs.buyOrder;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class buyOrderTest {
    @Test
    public static void buyOrderHappyScenario() {


        buyOrder xyOrder = new buyOrder();
        login loginApi = new login();


        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = xyOrder.byOrder(token);

        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
