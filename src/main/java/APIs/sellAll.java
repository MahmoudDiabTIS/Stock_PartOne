package APIs;

import ApiBase.RequestApi;
import URLs.URLs;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class sellAll extends RequestApi {

    public Response sll(String token){

        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getInvUrl2();

        String endPoint = "api/v1/orders/sell-all";

        String url = baseUrl + endPoint;

        setRequestURL(url);

        setBody("symbol", "AAPL");

        setContentType(ContentType.JSON);
        setHeaders("Authorization", "Bearer " + token);

        return getResponse("POST");
    }
}
