<<<<<<< HEAD
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
=======
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
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
