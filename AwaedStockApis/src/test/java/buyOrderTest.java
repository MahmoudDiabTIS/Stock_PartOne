import APIs.Login;
import APIs.BuyOrder;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class buyOrderTest {
    @Test
    public static void buyOrderHappyScenario() {


        BuyOrder xyOrder = new BuyOrder();
        Login loginApi = new Login();


        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = xyOrder.buyOrder(token);
        response.body().prettyPrint();
        response.then().statusCode(200);
    }
}
