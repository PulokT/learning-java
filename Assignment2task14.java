import java.util.Scanner;
public class Assignment2task14
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter number");
   int num;
   num=meow.nextInt();
   if(num>10)
   {
    if(num%2==0)
    {
     System.out.println("An even number greater than 10");
    }
    else
    {
      System.out.println("An odd number greater than 10");
    } 
   }
   else
   {
    if(num==10)
    {   
    }
    else if(num%2==0)
    {
      System.out.println("An even number less than 10");
    }
    else
    {
      System.out.println("An odd number less than 10");
    } 
   } 
 }  
}   
