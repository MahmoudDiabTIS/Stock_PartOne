package APIs;

import ApiBase.RequestApi;
import URLs.URLs;
import io.restassured.response.Response;

public class pricing extends RequestApi {

    public Response priice(String token){

        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getInvUrl2();

        String endPoint = "api/v1/orders/pricing";
        String url = baseUrl + endPoint;
        setRequestURL(url);

        setHeaders("Authorization", "Bearer " + token);

        return getResponse("GET");

    }
}
