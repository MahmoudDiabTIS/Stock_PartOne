import APIs.MarketAssets;
import APIs.Login;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class marketAssetsTest {

    @Test
    public static void marketAssetsHappySceanrio(){

        MarketAssets mrktAsset = new MarketAssets();
        Login loginApi = new Login();

        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = mrktAsset.marketAssets(token);
        response.body().prettyPrint();
        response.then().statusCode(200);



    }
}
