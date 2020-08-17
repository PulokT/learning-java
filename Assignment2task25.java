import java.util.Scanner;
public class Assignment2task25
{
  public static void main (String [] args)
  {
    Scanner meow= new Scanner(System.in);
    System.out.println("Are you the President? if yes then press 1 or else press 0");
    int a= meow.nextInt();
    if(a==1)
    {
    System.out.println("No Tax");
    }
    else
    {
    System.out.println("what is your age?");
    int b= meow.nextInt();
    if(b<18)
    {
    System.out.println("No Tax");
    }
    else
    {
    System.out.println("what is your salary?");
    int c = meow.nextInt();
    if(c<10000)
    {
    System.out.println("No Tax");
    }
    else
    {
    if(c<20000)
    {
    double tax= c*0.05;
    System.out.println("Tax is "+ tax +"TK");
    }
    else
    {
    double tax= c*0.1;
    System.out.println("Tax is "+ tax +"TK");
    }
    }
    }
    }
  }
}
