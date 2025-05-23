package practicceUtility;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map1= new HashMap<String, String>();
        map1.put("id01", "Value1");
        map1.put("id02", "Value2");
        map1.put("id03", "Value3");
        map1.put("id04", "Value4");
        map1.put("id05", "Value5");
        System.out.println(map1);
        System.out.println(map1.entrySet());
        //Keyset returns set of strings
        System.out.println(map1.keySet());

    }
}
