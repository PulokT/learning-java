import java.util.Scanner;
public class Assignment2task5
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter radius");
   int r;
   r=meow.nextInt();
   double circumference=2*3.1416*r;
   double area=3.1416*r*r;
   System.out.println("circumference:" +circumference);
   System.out.println("area:" +area);
 }  
}   
