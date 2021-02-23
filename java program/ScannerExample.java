import java.util.*;  
public class ScannerExample {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.nextLine(); 
	   try{ 
	  	Integer i = new Integer(name);
System.out.println(i); 
        }
	catch(Exception e){
	System.out.println("number format exception by nayan");
System.out.println("arey murakh number daal na");
}  
	            
          System.out.println("Name is: " + name);             
                     
          }  
}


  