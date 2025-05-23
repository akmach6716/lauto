package practicceUtility;

public class ThrowDemo {
    public static void main(String[] args) {
        int a=6;
        int b= 7;
        if(a<b)
        {
            throw new RuntimeException("Run time exception check to see the message ");
        }else {
            System.out.println("Dont throw anything");
        }
    }
}
