import APIs.AssetNews;
import APIs.Login;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class assetNewsTest {

    @Test
    public static void assetNewsHappyScenario(){

        AssetNews asstNews = new AssetNews();
        Login loginApi = new Login();

        Response res_login = loginApi.login("+966538772716", "1111");
        String token = res_login.jsonPath().get("data.access_token");

        Response response = asstNews.assetNews(token);
        response.body().prettyPrint();
        response.then().statusCode(200);
}

}
