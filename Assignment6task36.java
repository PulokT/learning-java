import java.util.Scanner;
public class Assignment6task36
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   double a=0;
   double b=0;
   System.out.println("Enter number of courses");
   double n=meow.nextDouble();
   double x=1;
   while(x<=n)
   {
   System.out.println("Enter grade");
   double c=meow.nextDouble();
   System.out.println("Enter credit");
   double d=meow.nextDouble();
   a=a+(c*d);
   b=b+d;
   x++;
   }
 System.out.println("CGPA "+(a/b));
 }
}
