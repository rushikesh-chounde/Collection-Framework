
package Array_Methods;

public class Majority {
    public static void main(String[] args)
    {
        int[] arr={3,3,3,1,2,8};
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
                count++;
            else
                
                count--;
            if(count<0)
                count=0;
        }
        if(count>0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
