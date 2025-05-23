package practicceUtility;

public class CustomException extends Exception{
    public CustomException(String customMessage) {
        System.out.println(customMessage);
    }

    public void Exception()
    {
        System.out.println("Constructor of the exception");
    }

    public void Exception(String customMessage)
    {

    }

    public static void main(String[] args) throws CustomException {

        if(7<8) {
            throw new CustomException("demo message check");
        }

    }
}
