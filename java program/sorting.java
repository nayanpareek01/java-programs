public class sorting
{
     public static void main(String args[])
     {
         int temp,ar[]={3124,345,34,355,12};
         for(int i=0;i<ar.length-1;i++)
         {
             for(int j=i;j<ar.length;j++)
             {
               if(ar[i]>ar[j])
             {
                temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
             }
           }
         }

          System.out.println("the sorted array is");
         for(int i=0;i<ar.length;i++)
         {
            
             System.out.println(ar[i]);
         }
     }
}