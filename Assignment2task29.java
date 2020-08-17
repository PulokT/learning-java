import java.util.Scanner;
public class Assignment2task29
{
  public static void main (String [] args)
  {
    Scanner meow= new Scanner(System.in);
    System.out.println("enter 1st side");
    double x= meow.nextInt(); 
    System.out.println("enter 2nd side");
    double y= meow.nextInt();
    System.out.println("enter 3rd side");
    double z= meow.nextInt();
    double s;
    s=(x+y+z)/2;
    double area;
    area= Math.sqrt(s*(s-x)*(s-y)*(s-z));
    System.out.println("area is "+ area +"square meter");
  }
}
