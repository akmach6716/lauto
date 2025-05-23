package practicceUtility;

import net.bytebuddy.implementation.bytecode.Throw;

public class CustomFrameworkExecption extends RuntimeException{
    public CustomFrameworkExecption(String message)
    {
        super(message);
    }
    public CustomFrameworkExecption(String message, Throwable cause)
    {
        super(message, cause);
    }
}
