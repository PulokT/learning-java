import java.util.Scanner;
public class Assignment6task26
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=meow.nextInt();
   int b=1;
   int sum=0;
   while(b<=n)
   {
     if(b%2!=0)
     {
     sum=sum+b;
     }
     else{}
     b=b+1;
   }
   System.out.println(sum);
 }
}
