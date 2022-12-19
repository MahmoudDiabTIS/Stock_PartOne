import APIs.ViewOne;
import APIs.Login;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class viewOneTest {

    @Test
    public static void viewOneHappyScenario(){

        ViewOne vwOne = new ViewOne();
        Login loginApi = new Login();

        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = vwOne.viewOne(token);
        response.body().prettyPrint();
        response.then().statusCode(200);
}
}
