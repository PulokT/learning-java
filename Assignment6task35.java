import java.util.Scanner;
public class Assignment6task35
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   double count=1;
   double a= 1;
   double b= 2;
   System.out.println(a);
   System.out.println(b);
   while(count<=998)
   {
   double c=a*b;
   System.out.println(c);
   a=b;
   b=c;
   count++;
   }
 }
}
