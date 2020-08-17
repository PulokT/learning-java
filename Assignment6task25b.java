import java.util.Scanner;
public class Assignment6task25b
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int sum= 0;
   int max= 0;
   int b= 0;
   System.out.println("Enter a number");
   int a=meow.nextInt();
   if(a%2!=0)
   {
   sum=a;
   max=a;
   b=b+1;
   }   
   else{};
   int i=1;
   while(i<=6)
   {
   System.out.println("Enter a number");
   int c=meow.nextInt();
   if(c%2!=0)
   {sum=sum+c;
    b=b+1; 
   if(c>max)
   {
    max=c;
   }
   else{}
   }
   else{}
   i=i+1;
   }
   double avg = sum/b;
   System.out.println("Max is "+max);
   System.out.println("Average is "+avg);
 }
 }
