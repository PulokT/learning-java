import java.util.Scanner;
public class Assignment2task28
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter value of S");
   double s=meow.nextInt();
   double L;
   if(s<100)
   {
    L=3000-(125*s*s); 
   }
   else
   {
    L=1200/(4+((s*s)/14900));
   }
   System.out.println(L); 
  }  
}   
