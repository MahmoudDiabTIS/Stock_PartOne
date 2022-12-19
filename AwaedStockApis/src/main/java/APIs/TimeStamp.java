package APIs;

import java.sql.Timestamp;

public class TimeStamp {
    public static String timeStamp() {

        // method 1
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return String.valueOf(timestamp.getTime()/1000);

    }
}