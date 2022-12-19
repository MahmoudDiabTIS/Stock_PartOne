import APIs.Login;
import APIs.SellOrder;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class sellOrderTest {

    @Test
    public static void sellOrderHappyScenario(){


        SellOrder selOrder = new SellOrder();
        Login loginApi = new Login();

        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = selOrder.sellOrder(token);
        response.body().prettyPrint();
        response.then().statusCode(200);

    }



}
