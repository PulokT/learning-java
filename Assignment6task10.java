import java.util.Scanner;
public class Assignment6task10
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("Enter your favourite name");
   String a= meow.nextLine();
   System.out.println("Enter a number");
   int b= meow.nextInt();
   int i=0;
   while(i<=b)
   {
   System.out.println(a);
   i+=1;
   }
 }
}
