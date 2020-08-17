import java.util.Scanner;
public class Assignment2task31
{
  public static void main (String [] args)
  {
    Scanner meow = new Scanner (System.in);
    System.out.println("Enter total number of courses");
    int num1;
    num1=meow.nextInt();
    System.out.println("Enter credits per course");
    int num2;
    num2=meow.nextInt();
    System.out.println("Enter cost per credit");
    int num3;
    num3=meow.nextInt();
    int cost;
    cost=num1*num2*num3;
    System.out.println("total cost is "+cost+"TK");
  }
}
    
