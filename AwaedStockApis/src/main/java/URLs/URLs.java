package URLs;

public class URLs {

    //[LK Test Server API] Env. -- AwaedMobile >> Auth >> Login >> login (Phone)
    public String getInvUrl() {
        return stockloginBaseURL;
    }

    // [MS_TEST] Env. -- Investor >> Login >> Login (Phone)
    public String getInvMSURL(){
        return stockloginMSBaseURL;
    }


    String stockloginBaseURL = "https://lk-api-test.awaed.co/v1";
    String stockloginMSBaseURL= "https://api-test.awaed.co/api/investor/v1";
    String stockBaseUrl = "https://stock-test.awaed.co/";

    public String getInvUrl2(){
        return stockBaseUrl;
    }

}