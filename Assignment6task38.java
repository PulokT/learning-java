import java.util.Scanner;
public class Assignment6task38
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("Enter a number");
   int input=meow.nextInt();
   int b=2;
   int sum=0;
   while(b<input)
   {
    if(input%b==0)
    {sum=sum+b;
     }
    else{}
    b++;
   }
   if(sum==0){System.out.println("Prime number");
 }
   else{System.out.println("Not prime number");}
 }
}
   
