import APIs.login;
import APIs.sellOrder;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class sellOrderTest {

    @Test
    public static void sellOrderHappyScenario(){


        sellOrder selOrder = new sellOrder();
        login loginApi = new login();


        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = selOrder.sllOrder(token);

        response.body().prettyPrint();
        response.then().statusCode(200);

    }



}
