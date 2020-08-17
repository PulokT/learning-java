import java.util.Scanner;
public class Assignment6task6
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int sum=0;
   int i=1;
   while(i<=20)
   {
   System.out.println("Enter number");
   int a=meow.nextInt();
   sum=sum+a;
   i=i+1;
   }
   double avg=sum/(i-1);
   System.out.println("Average is "+avg);
 }
}
