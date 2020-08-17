import java.util.Scanner;
public class Assignment2task7
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter number");
   int num1;
   num1=meow.nextInt();
   System.out.println("enter another number");
   int num2;
   num2=meow.nextInt();
   if(num1>num2)
   {
     System.out.println("first is greater");
   } 
   else
   {
     System.out.println("first is not greater");
     
   } 
 }  
}   
