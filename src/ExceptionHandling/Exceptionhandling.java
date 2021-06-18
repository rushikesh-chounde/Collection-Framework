
package ExceptionHandling;


public class Exceptionhandling {
    public static void main(String[] args)
    {
        try
        {
            int a=10,b=0,c;
            c=a/b;//ARITHMETIC EXCEPTION
            System.out.println(c);
        }
        catch(ArithmeticException e)//IF WE DON'T KNOW THE CLASS OF EXCEPTION WE CAN TAKE EXCEPtION ONLY(EXCEPTION E) BECAUSE IT IS PARENT CLASS OF ALL EXCEPTION
        {
           System.out.println(e);
           System.out.println("cannot divide by zero");//CATCH BLOCK IS EXECUTED ONLY WHEN EXCEPTION IS OCCURED
          // e.printStackTrace();
          System.out.println(e.getMessage());
        }
        
        finally       //THIS BLOCK ALWAYS EXECUTE IF EXCEPTION IS OCCURED OR NOT
        {
            System.out.println("111111");
        }     //IF WE USE FINALLY BLOCK WITHOUT CATCH BLOCK THEN FINALLY BLOCK IS EXECUTED AFTER TRY BLOCK BUT IF THERE IS EXCEPTION THEN FINALLY BLOCK IS NOT EXECUTED
        
        //WE CAN TRY MULTIPLE CATCH BLOCK WITH TRY BLOCK BUT WE CAN USE ONLY ONE FINALLY BLOCK
        
        //IF WE USE RETURN BREAK CONTINUE IN TRY BLOCK THEN ALSO FINALLY IS EXECUTED
        //3 CONDITIONS WHEN FINALLY BLOCK IS NOT EXECUTED
        //1.IF WE WRITE SYSTEM.EXIT()
        //2.IF ERRORS OCCUR BETWEEN PROGRAM
        //3.IF EXCEPTION OCCURED IN FINALLY BLOCK
        
        System.out.println("-------");
        
        
                
    }
}
