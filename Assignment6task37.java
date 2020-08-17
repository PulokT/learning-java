import java.util.Scanner;
public class Assignment6task37
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int a=1;
   while(a<=1600)
   {
   int b=1;
   int sum=0;
   while(b<a)
   {
     if(a%b==0){
     sum=sum+b;
     }
     else{}
     b++;
     }
   if(sum==a)
   {
   System.out.println(a);
   }
   else{}
   a++;
   }
 }
}
