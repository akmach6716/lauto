package practicceUtility;

import java.util.*;

public class Mapdemo1 {
    public static void main(String[] args) {
        HashMap<String, String> hmap= new HashMap<String,String>();
        LinkedHashMap<String, String> lhmap= new LinkedHashMap<String, String>();
        TreeMap<String, String> tmap= new TreeMap<String, String>();
        hmap.put("ID01", "String1");
        hmap.put("ID02", "String2");
        hmap.put("ID03", "String3");
        hmap.put("ID04", "String4");
        System.out.println(hmap);
       Set<Map.Entry<String, String>> s1=hmap.entrySet();
       



     }
}
