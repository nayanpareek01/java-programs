import java.util.*;
public class emailvalidate
{
    public static void main(String args[])
    {
        int Flag=0;
        Scanner sc = new Scanner(System.in);
        String mail = sc.nextLine();
        for(int i=0;i<mail.length();i++)
        {
         
        if(mail.charAt(i)=='@')
        {
            Flag=1;
            break;
        }
        }

        if(Flag==1)
        {
            System.out.print("It is a valid email address");
        
        }
        else 
        {
            System.out.print("the email you entered is not valid");
        }

        
    }
}