import java.util.Scanner;
public class Assignment6task14
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=meow.nextInt();
   int i=1;
   int Sum=0;  
     while(i<=n)
     {Sum=Sum+i*i*i;
       i=i+1;
     }
     System.out.println(Sum);
 }
}
