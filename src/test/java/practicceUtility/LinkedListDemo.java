package practicceUtility;

import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<String>();
        names.addFirst("Java");
        names.addLast("Python");
        names.add("Selenium");
        System.out.println(names);
        names.removeLast();
        System.out.println(names);
    }
}
