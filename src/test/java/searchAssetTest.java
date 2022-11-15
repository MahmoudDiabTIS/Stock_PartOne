import APIs.login;
import APIs.searchAsset;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class searchAssetTest {
    @Test
    public static void searchAssetHappyScenario(){


        searchAsset srchAssets = new searchAsset();
        login loginApi = new login();

        Response res_login = loginApi.login("+966538772716", "1111");
        res_login.body().prettyPrint();
        String token = res_login.jsonPath().get("data.access_token");

        Response response = srchAssets.srchAsset(token);

        System.out.println(response.body().prettyPrint());
        System.out.println();

        response.then().statusCode(200);

    }



}
