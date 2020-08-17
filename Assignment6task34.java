import java.util.Scanner;
public class Assignment6task34
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("Enter a number");
   int s=meow.nextInt();
   int a=4;
   int sum=0;
   while(a<=s){
   sum=sum+a;
   a=a+4;
   }
   System.out.println(sum);
 }
}
