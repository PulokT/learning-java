import java.util.Scanner;
public class Assignment2task27
{
  public static void main (String [] args)
  {
    Scanner meow= new Scanner(System.in);
    System.out.println("enter seconds");
    int num=meow.nextInt();
    int hours;
    hours=num/3600;
    int reminder1;
    reminder1=num%3600;
    int minutes;
    minutes=reminder1/60;
    int seconds;
    seconds=reminder1%60;
     System.out.println(hours+"hours");
     System.out.println(minutes+"minutes");
     System.out.println(seconds+"seconds");
  }
}
