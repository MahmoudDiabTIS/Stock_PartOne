package APIs;

import ApiBase.RequestApi;
import URLs.URLs;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class showAsset extends RequestApi{

    public Response shwAsset(String token){

        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getInvUrl2();

        String endPoint = "api/v2/assets/AAPL";
        String url = baseUrl + endPoint;
        setRequestURL(url);

        setHeaders("Authorization", "Bearer " + token);

        return getResponse("GET");

    }
}
