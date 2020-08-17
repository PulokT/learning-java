import java.util.Scanner;
public class Assignment6task30
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int sum=0;
   int a=1;
   while(a<=20)
   {
   System.out.println("Enter a number");
   int b=meow.nextInt();
   sum=sum+b;
   a=a+1;
   System.out.println(sum);
   }
 }
}
