import java.util.*;
public class oddeven
{
    public static void main(String args[])
    {
        int even=0,odd=0;
        System.out.println("Enter how many number you want to enter");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer ar[] = new Integer[num];// they are wrapper class

        for(int i=0;i<num-1;i++){
            ar[i] = sc.nextInt();
        }
        for(int i=0;i<num-1;i++){
        System.out.println(ar[i]);        
        }

        for(int i=0;i<num-1;i++)
      { 
          if (ar[i]%2==0)
      {
         even++;       
       }
       else 
       {
           odd++;
       }
    }
    System.out.println("the total even number are=" + even);
    System.out.println("the total odd number are=" + odd);
}
} 