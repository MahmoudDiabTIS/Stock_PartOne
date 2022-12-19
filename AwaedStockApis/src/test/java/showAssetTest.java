import APIs.ShowAsset;
import APIs.Login;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class showAssetTest {

    @Test
    public static void showAssetHappyScenario(){

        ShowAsset shwAsset = new ShowAsset();
        Login loginApi = new Login();

        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = shwAsset.showAsset(token);
        response.body().prettyPrint();
        response.then().statusCode(200);

    }
}
