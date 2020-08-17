import java.util.Scanner;
public class Assignment2task35
{
  public static void main (String [] args)
  {
    Scanner meow= new Scanner(System.in);
    System.out.println("enter hour(24hr format)");
    int hr=meow.nextInt();
    if(hr>24)
    {
    System.out.println("wrong Time");
    }
    else
    {
    if(hr<4)
    {
     System.out.println("patience is virtue");
    }
    else
    {
    if(hr<7)
    {
     System.out.println("Breakfast");
    }
    else
    {
    if(hr<12)
    {
     System.out.println("Patience is vitue");
    }
    else
    {
     if(hr<14)
    {
     System.out.println("Lunch");
    }
     else
     {
     if(hr<16)
    {
     System.out.println("Wrong Time");
    }
     else
     {
     if(hr<18)
    {
     System.out.println("Snacks");
    }
     else
     {
     if(hr<19)
    {
     System.out.println("Wrong Time");
    }
     else
     {
     if(hr<21)
    {
     System.out.println("Dinner");
    }
     else
      {
     System.out.println("Wrong Time");
    }
    }
    }
    }
    }
    }
    }
    }
    }
  }
}
