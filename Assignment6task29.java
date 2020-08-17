import java.util.Scanner;
public class Assignment6task29
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int b=3;
   int product=1;
   while(b<=13)
   {
     if(b%2!=0)
     {
     product=product*b;
     }
     else{}
     b=b+1;
   }
   System.out.println(product);
 }
}
