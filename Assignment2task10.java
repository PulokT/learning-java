import java.util.Scanner;
public class Assignment2task10
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter a number");
   int num1=meow.nextInt();
   if(num1%2==0)
   {
    System.out.println("The number is even");
   } 
   else
   {
    System.out.println("The number is odd"); 
   } 
  }  
}   
