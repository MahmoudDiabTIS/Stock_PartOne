package APIs;

import ApiBase.RequestApi;
import URLs.URLs;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BuyOrder extends RequestApi {

    public Response buyOrder(String token) {

        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getInvUrl2();

        String endPoint = "api/v1/orders/buy";

        String url = baseUrl + endPoint;

        setRequestURL(url);

        setBody("symbol", "AMZN");
        setBody("qty", "0.05");

        setContentType(ContentType.JSON);
        setHeaders("Authorization", "Bearer " + token);

        return getResponse("POST");
    }
}
