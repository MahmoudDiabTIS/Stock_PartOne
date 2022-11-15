import APIs.login;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class loginTest {

    @Test
    public static void loginHappyScenario(){

        login loginApi = new login();

        Response res_login = loginApi.login("+966538772716", "1111");
        res_login.body().prettyPrint();

    }
}