import java.util.Scanner;
public class Assignment6task31
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("Enter your number");
   int a=meow.nextInt();
   int sum= a;
   int max= a;
   int min= a;
   int i= 1;
   while(i<=9)
   {
   System.out.println("Enter your number");
   int b=meow.nextInt();
   sum=sum+b;
   if(b>max)
   {
    max=b;
   }
   else if(b<min)
   {
   min=b;
   }
   else{}
   i=i+1;
   }
   double avg = sum/i;
   System.out.println("Max is "+max);
   System.out.println("Min is "+min);
   System.out.println("Average is "+avg);
 }
 }
