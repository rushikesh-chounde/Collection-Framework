
package Patterns;

import java.util.Scanner;

public class Allpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        
//        for(int i=n;i>0;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        
        
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i-1;j++)
//            {
//                System.out.print("  ");
//            }
//            for(int j=1;j<=n-i+1;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        
        
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n-i;j++)
//            {
//                System.out.print("  ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        
        
//        for(int i=1;i<=n;i++)
//        {
//          for(int j=1;j<=n-i;j++)
//          {
//              System.out.print("  ");
//          }
//          for(int j=1;j<=i;j++)
//          {
//              System.out.print("* ");
//             System.out.print("  ");
//          }
//            System.out.println(); 
//        }
        
        
//        int count=1;
//         for(int i=1;i<=n;i++)
//        {
//          for(int j=1;j<=n-i;j++)
//          {
//              System.out.print("  ");
//          }
//          for(int j=1;j<=i;j++)
//          {
//              
//              System.out.print(count+" ");
//             System.out.print("  ");
//             count++;
//          }
//            System.out.println(); 
//        }
//        
        for(int i=1;i<=(n+1)/2;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=(n-1)/2;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
//       for(int i=1;i<=n;i++)
//       {
//           if(i==1)
//           {
//               System.out.print("*  ");
//           }
//           else if(i==n)
//           {
//               for(int j=1;j<=n;j++)
//               {
//                   System.out.print("*  ");
//               }
//           }
//           else
//           {
//               System.out.print("*  ");
//               for(int k=1;k<=(i-2);k++)
//               {
//                   System.out.print("   ");
//               }
//                System.out.print("*  ");
//           }
//           System.out.println();
//       }
//        
}
}
