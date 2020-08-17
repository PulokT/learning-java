import java.util.Scanner;
public class Assignment6task32
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int a=1;
   int sum=0;
   while(a<=300)
   {
   if(a%7==0)
   {
   sum=sum+a;
   }
   else if (a%9==0)
   {
   sum=sum+a;
   }
   else{}
   a++;
   }
   System.out.println(sum);
 }
}
