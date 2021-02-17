import java.util.*;
public class arrayreverse
{
    public static void main (String args[])
    {
        int count;
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer ar[] = new Integer[num];// they are wrapper class
        Integer arr[] = new Integer[num];// they are wrapper class

        for(int i=0;i<num;i++)
        {
            ar[i] = sc.nextInt();
        }
        count=ar.length-1;
        for(int j=0;j<num;j++)
        {
          arr[j]=ar[count];
          count--;
        }
        System.out.println("reversed array is:-");
        for(int j=0;j<num;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
