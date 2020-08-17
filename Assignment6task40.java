import java.util.Scanner;
public class Assignment6task40
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("Enter tk");
   int tk=meow.nextInt();
   int a1=tk/500;
   int a2=tk%500;
   int b1=a2/100;
   int b2=a2%100;
   int c1=b2/50;
   int c2=b2%50;
   int d1=c2/20;
   int d2=c2%20;
   int e1=d2/10;
   int e2=d2%10;
   int f1=e2/5;
   int f2=e2%5;
   int g1=f2/2;
   int g2=f2%2;
   System.out.println("500 tk:"+a1+"notes");
   System.out.println("100 tk:"+b1+"notes");
   System.out.println("50 tk:"+c1+"notes");
   System.out.println("20 tk:"+d1+"notes");
   System.out.println("10 tk:"+e1+"notes");
   System.out.println("5 tk:"+f1+"notes");
   System.out.println("2 tk:"+g1+"notes");
   System.out.println("1 tk:"+g2+"notes");
 }
}
