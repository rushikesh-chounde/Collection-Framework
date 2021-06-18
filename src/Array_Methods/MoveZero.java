
package Array_Methods;

public class MoveZero {
    static int[] arr={10,5,0,0,8,0,9,0};
    public static void main(String[] args)
    {
        //Naive Approach
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]==0)
//            {
//                for(int j=i+1;j<arr.length;j++)
//                    if(arr[j]!=0)
//                        swap(arr[i],arr[j],i,j);
//            }
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
        
        //Efficient Solution
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                swap(arr[i],arr[count],i,count);
                count++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    public static void swap(int x,int y,int i,int j )
    {
        arr[i]=y;
        arr[j]=x;
    }
   
}
