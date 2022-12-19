import APIs.Login;
import APIs.SearchAsset;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class searchAssetTest {
    @Test
    public static void searchAssetHappyScenario(){


        SearchAsset srchAssets = new SearchAsset();
        Login loginApi = new Login();

        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = srchAssets.searchAsset(token, "asset", "AAPL");
        response.body().prettyPrint();
        response.then().statusCode(200);

    }



}
