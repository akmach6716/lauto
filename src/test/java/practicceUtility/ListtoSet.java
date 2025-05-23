package practicceUtility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListtoSet {
    public static void main(String[] args) {
        List<String> nameList= new ArrayList<String>();
        nameList.add("Java");
        nameList.add("Python");
        nameList.add("C#");
        nameList.add("Playwright");
        nameList.add("Selenium");
        nameList.add("Selenium");
        System.out.println(nameList);
        Set<String> nameSet= new HashSet<>(nameList);
        System.out.println(nameSet);


    }
}
