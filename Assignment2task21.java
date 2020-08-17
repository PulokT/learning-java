import java.util.Scanner;
public class Assignment2task21
{
  public static void main (String [] args)
  {
    Scanner meow= new Scanner(System.in);
    System.out.println("enter mark");
    int x=meow.nextInt();
    if(x>=90)
    {
    System.out.println("Grade A");
    }
    else
    {
     if(x>=80)
     {
     System.out.println("Grade B");
     }
     else
     {
      if(x>=70)
     {
     System.out.println("Grade C");
     }
     else
     {
      if(x>=60)
     {
     System.out.println("Grade D");
     }
     else
     {
      if(x>=50)
     {
     System.out.println("Grade E");
     }
     else
     {
     System.out.println("Grade F");
     }
     }
     }
     }
     }
  }
}
  
