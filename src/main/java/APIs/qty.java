package APIs;

import ApiBase.RequestApi;
import URLs.URLs;
import io.restassured.response.Response;

public class qty extends RequestApi {

    public Response qtyy (String token){

        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getInvUrl2();

        String endPoint = "api/v1/orders/qty/AAPL";
        String url = baseUrl + endPoint;
        setRequestURL(url);

        setHeaders("Authorization", "Bearer " + token);

        return getResponse("GET");
    }
}
