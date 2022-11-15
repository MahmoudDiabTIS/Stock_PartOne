package APIs;

import ApiBase.RequestApi;
import URLs.URLs;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class sellOrder extends RequestApi {

    public Response sllOrder (String token){

        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getInvUrl2();

        String endPoint = "api/v1/orders/sell";

        String url = baseUrl + endPoint;

        setRequestURL(url);

        setBody("symbol", "AAPL");
        setBody("qty", "0.04");

        setContentType(ContentType.JSON);
        setHeaders("Authorization", "Bearer " + token);

        return getResponse("POST");

    }
}
