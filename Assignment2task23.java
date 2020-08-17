import java.util.Scanner;
public class Assignment2task23
{
  public static void main (String [] args)
  {
    Scanner meow= new Scanner(System.in);
    System.out.println("enter height");
    int num1=meow.nextInt();
    System.out.println("enter widht");
    int num2=meow.nextInt();
    int area;
    area=num1*num2;
    System.out.println(area);
  }
}
