import java.util.Scanner;
public class Assignment2task20
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter mark");
   int mark=meow.nextInt();
   if(mark>50)
   {
    System.out.println("Pass"); 
   }
   else
   {
    System.out.println("You shall not pass"); 
   } 
  }  
}   
