package APIs;

import ApiBase.RequestApi;
import URLs.URLs;
import io.restassured.response.Response;

public class SearchAsset extends RequestApi {

    public Response searchAsset(String token, String type, String keyword){

        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getInvUrl2();

        String endPoint = "api/v1/search";
        String url = baseUrl + endPoint;
        setRequestURL(url);

        setHeaders("Authorization", "Bearer " + token);
        setFormParams("type", type);
        setFormParams("keyword", keyword);

        return getResponse("GET");

    }
}
