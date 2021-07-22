package co.com.petstore.testing.utils;


import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class GetCurrent {

    private GetCurrent() {
    }

    public static String date() {
        SimpleDateFormat dateFormat;
        GregorianCalendar date = new GregorianCalendar();
        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sssXXX");
        return dateFormat.format(date.getTime());
    }
}
