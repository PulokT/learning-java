import java.util.Scanner;
public class Assignment2task15
{
  public static void main (String [] args)
  {
    Scanner meow= new Scanner(System.in);
    System.out.println("enter 1st num");
    int num1=meow.nextInt();
    if(num1%2==0)
    {
    System.out.println(num1);
    }
    else
    {
    if(num1%5==0)
    {
    System.out.println(num1);
    }
    else{}
    }
  }
}
