import java.util.*;  
public class searching
{
    public static void main(String args[])
    {
        int Flag=0,i,ar[]={17,26,3243,43,45};
        Scanner in = new Scanner(System.in);  
          System.out.print("target element");  
         int element = in.nextInt(); 
         for(i=0;i<ar.length;i++)
         {
         //  System.out.println(ar[i]);
         
         if(ar[i]==element)
         {
           //System.out.println(element);
            
          //  System.out.println("element found"); 
            Flag=1; 
            System.out.println("the index is "+element);
            break;
         }
           
         }

          if(Flag==1)
          {
            System.out.println("Element found");
          }
         else
         {
            System.out.println("element not found");
         }
       
    }
}
