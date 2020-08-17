import java.util.Scanner;
public class Assignment6task25a
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
   sum=sum+b;
   if(b<min)
   {
    min=b;
   }
   else{}
   i=i+1;
   }
   double avg = sum/i;
   System.out.println("Min is "+min);
   System.out.println("Average is "+avg);
 }
 }
