import java.util.Scanner;
public class Assignment6task20
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter a number");
   int n=meow.nextInt();
   int i=7;
   int sum=0;
   while(i<=n){
     sum=sum+i;
     i=i+7;
   }
   System.out.println(sum);
 }
}
     
