import java.util.Scanner;
public class Assignment2task9
{
  public static void main (String [] args)
  {
    Scanner meow = new Scanner (System.in);
    System.out.println("Enter num1");
    int num1;
    num1=meow.nextInt();
    System.out.println("Enter num2");
    int num2;
    num2=meow.nextInt();
    if(num1>num2)
    {
      int difference;
      difference= num1-num2;
      System.out.println(difference);
    }
    else
    {
    int difference;
      difference= num2-num1;
      System.out.println(difference);
    }
    }
}
