package practicceUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        geturrentDate();
    }
    public static  String geturrentDate()
    {
        SimpleDateFormat sdt= new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        System.out.println(sdt.format(new Date()));
        return sdt.format(new Date());
    }

}
