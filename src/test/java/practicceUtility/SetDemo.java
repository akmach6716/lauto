package practicceUtility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> demoSet= new HashSet<String>();
        demoSet.add("Playwright");
        demoSet.add("Cypress");
        demoSet.add("SQL");
        demoSet.add("Cypress");
        System.out.println(demoSet);
        //demoSet.clear();
        Iterator<String> iteratorDemo =demoSet.iterator();
        System.out.println(iteratorDemo.toString());

    }
}
