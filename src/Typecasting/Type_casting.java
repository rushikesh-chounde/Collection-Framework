
package Typecasting;

public class Type_casting {
    
//    Widening Casting (automatically) - converting a smaller type to a larger type size
//    byte -> short -> char -> int -> long -> float -> double

//    Narrowing Casting (manually) - converting a larger type to a smaller size type
//    double -> float -> long -> int -> char -> short -> byte

    public static void main(String[] args) 
    {
        //String -----> int
        //throws NumberFormatException  
//        String s="200";
//        int i1=Integer.parseInt(s);
//        System.out.println(Integer.parseInt(s));
//        
//        int i=Integer.valueOf(s);
//        System.out.println(i);
        
        //int--------->String
//        int i1=200;  
//        String s1=String.valueOf(i1); 
//        System.out.println(s1);
       
//        int i=200;  
//        String s=Integer.toString(i);
//        System.out.println(s);

        
        //String--------->char
//        String s="hello";  
//        char c=s.charAt(0);
//        System.out.println(c);
//        String s1="hello";    
//        char[] ch=s1.toCharArray();    
//        for(int i=0;i<ch.length;i++)
//        {
//            System.out.println(ch[i]);
//        }
        
        //char----------->String
//        char c='S';  
//        String s=String.valueOf(c);  
//        System.out.println(s);
//        char c1='M';    
//         s=Character.toString(c1);  
//         System.out.println(s);
       
        //char---------->int
//        char c='a';
//        int a=c;
//        System.out.println(a);//Print ASCII value of that character
//         char c='1';  
//         int a=Character.getNumericValue(c);  
//        System.out.println(a);
//         c='1';  
//         a=Integer.parseInt(String.valueOf(c));  
//         System.out.println(a);
//         
        //int----------->char
//         int a=65;  
//         char c=(char)a;  
//         System.out.println(c); 
//        int REDIX=10;//redix 10 is for decimal number, for hexa use redix 16  
//         a=9;    
//         char c1=Character.forDigit(a,REDIX);    
//        System.out.println(c1);   
        
    }
}
