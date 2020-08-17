import java.util.Scanner;
public class Assignment6task3
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int a=1;
   while(a<=5)
   {
     System.out.println("Enter a number");
     int num= meow.nextInt();
     if(num%2==0)
     {System.out.println("Number is even");
     }
     else
     {System.out.println("Number is odd");
     }
      a=a+1;
   }
 }
}
