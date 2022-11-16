package APIs;

import ApiBase.RequestApi;
import URLs.URLs;
import io.restassured.response.Response;

public class login extends RequestApi {

    public Response login(String phone, String password){

        URLs getBaseUrl = new URLs();
        String baseUrl = getBaseUrl.getInvUrl();

        String endPoint = "/login";

        String url = baseUrl + endPoint;

        setRequestURL(url);

        setFormParams("phone", phone);
        setFormParams("password", password);


        setHeaders("X-Request-Id", "ee142e57-2698-44fc-802d-620aa3245379");
        setHeaders("X-Request-Timestamp", TimeStampExample.mh());

        return getResponse("POST");

    }
}