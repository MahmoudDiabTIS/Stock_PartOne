package APIs;

import ApiBase.RequestApi;
import URLs.URLs;
import io.restassured.response.Response;

public class searchAsset extends RequestApi {

    public Response srchAsset(String token){

        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getInvUrl2();

        String endPoint = "api/v1/search?type=assets&keyword=AAPL";
        String url = baseUrl + endPoint;
        setRequestURL(url);

        setHeaders("Authorization", "Bearer " + token);

        return getResponse("GET");

    }
}
