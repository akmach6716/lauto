package testcases;

public class SampleThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<String> tl1 = new ThreadLocal<>();
        tl1.set("Trina");

        ThreadLocal<String> tl2 = new ThreadLocal<>();
        tl2.set("Ridhi");

        ThreadLocal<String> tl3 = new ThreadLocal<>();
        tl3.set("Mahen");
        System.out.println(tl1.get());

    }
}
