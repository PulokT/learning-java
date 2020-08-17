import java.util.Scanner;
public class Assignment6task13
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("Enter a number");
   int a=meow.nextInt();
   int sum= a;
   int min= a;
   int i= 1;
   while(i<=6)
   {
   System.out.println("Enter a number");
   int b=meow.nextInt();
   if(b%2==0)
   {sum=sum+b;
   if(b<min)
   {
    min=b;
   }
   else{}
   i=i+1;
   }
   else{}
   }
   double avg = sum/i;
   System.out.println("Min is "+min);
   System.out.println("Average is "+avg);
 }
 }
