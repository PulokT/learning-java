import java.util.Scanner;
public class Assignment2task4
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter a number");
   int num1=meow.nextInt();
   System.out.println("enter another number");
   int num2=meow.nextInt();
   int sum;
   sum=num1+num2;
   int product;
   product=num1*num2;
   int difference;
   difference=num1-num2;
   System.out.println(sum);
   System.out.println(product);
   System.out.println(difference);
 }  
}   
