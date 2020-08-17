import java.util.Scanner;
public class Assignment2task19
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter number");
   int num;
   num=meow.nextInt();
   if(num%2==0)
   {
    if(num%5==0)
    {
    }
    else
    {
     System.out.println(num); 
    } 
   }
   else
   {
    System.out.println(num); 
   } 
 }  
}   
