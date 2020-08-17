import java.util.Scanner;
public class Assignment6task28
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int product=1;
   System.out.println("Enter number of inputs");
   int x=meow.nextInt();
   int a=1;
   while(a<=x)
   {
   System.out.println("Enter a number");
   int b=meow.nextInt();
   product=product*b;
   a=a+1;
   }
    System.out.println(product);
 }
}
