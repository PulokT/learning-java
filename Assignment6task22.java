import java.util.Scanner;
public class Assignment6task22
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int a=1;
   int b=0;
   int sum=0;
   while(a<=10){
   System.out.println("Enter a num");
   int x=meow.nextInt();
   if(x%2!=0)
   {
   b=b+1;
   sum=sum+x;
   }
   else{}
   a=a+1;
   }
   System.out.println("Total "+sum);
   System.out.println("Average "+(sum/b));
 }
}
