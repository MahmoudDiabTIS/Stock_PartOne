import APIs.login;
import APIs.sellAll;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class sellAllTest {

    @Test
    public static void sellAllHappyScenario(){

        sellAll slla = new sellAll();
        login loginApi = new login();


        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = slla.sll(token);

        response.body().prettyPrint();
        response.then().statusCode(200);

    }
}
