import java.util.Scanner;
public class Assignment2task11
{
  public static void main (String [] args)
  {
    Scanner meow= new Scanner(System.in);
    System.out.println("enter 1st num");
    int num1=meow.nextInt();
    System.out.println("enter 2nd num");
    int num2=meow.nextInt();
    System.out.println("enter 3rd num");
    int num3=meow.nextInt();
    System.out.println("enter 4th num");
    int num4=meow.nextInt();
    System.out.println("enter 5th num");
    int num5=meow.nextInt();
    int sum;
    sum= num1 + num2 + num3 + num4 + num5;
    int average;
    average = sum/5;
    System.out.println(average);
  }
}
