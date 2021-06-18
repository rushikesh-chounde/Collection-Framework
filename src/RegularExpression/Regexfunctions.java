
package RegularExpression;

//import java.util.*;
import java.util.regex.*;
//import java.util.regex.Pattern;
//import java.util.regex.Pattern;

public class Regexfunctions {
    
       public static void main(String[] args) {
        //Pattern p = Pattern.compile("^1");//caret
        //Pattern p = Pattern.compile("^12$");
        //Pattern p = Pattern.compile("^[0-9]");
        //Pattern p = Pattern.compile("^[A-Z][0-9]$");
        //Pattern p = Pattern.compile("^[a-z]");
        //Pattern p = Pattern.compile("^[A-Za-z0-9]");
       // Pattern p = Pattern.compile("^A.9$");
        //Pattern p = Pattern.compile("^A@*9$");
        //Pattern p = Pattern.compile("^A@+9$");
        //Pattern p = Pattern.compile("^A%{3}9$");
        Pattern p = Pattern.compile("^A%{3,5}9$");
        //Pattern p = Pattern.compile("^[7-9][0-9]{9}");
//        email should start with alphabet
//                email contains ._- 0-9 A-Z a-z
                        
        Matcher m = p.matcher("A%%%%%9");
       
        if(m.matches())
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
    
}
