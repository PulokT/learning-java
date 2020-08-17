import java.util.Scanner;
public class Assignment2task26
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter hours worked");
   int hours=meow.nextInt();
   int salary;
   if(hours>40)
   {
    int extra=hours-40;
    salary=8000+(extra*300); 
   }
   else
   {
    salary=hours*200;
   }
   System.out.println(salary); 
  }  
}   
