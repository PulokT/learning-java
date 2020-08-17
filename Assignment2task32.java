import java.util.Scanner;
public class Assignment2task32
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter value of q");
   double q=meow.nextInt();
   double p;
   if(q>50)
   {
    p=1000/(3+((q*q)/1900)); 
   }
   else
   {
    p=6000+(15*q*q);
   }
   System.out.println(p); 
  }  
}   
