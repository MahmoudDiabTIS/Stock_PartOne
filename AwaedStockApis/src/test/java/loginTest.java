import APIs.Login;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class loginTest {

    @Test
    public static void loginHappyScenario(){

        Login loginApi = new Login();

        Response res_login = loginApi.login("+966538772716", "1111");

    }
}