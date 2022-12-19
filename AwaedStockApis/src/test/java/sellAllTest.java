import APIs.Login;
import APIs.SellAll;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class sellAllTest {

    @Test
    public static void sellAllHappyScenario(){

        SellAll slla = new SellAll();
        Login loginApi = new Login();


        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = slla.sellAll(token);
        response.body().prettyPrint();
        response.then().statusCode(200);

    }
}
