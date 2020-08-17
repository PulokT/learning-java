import java.util.Scanner;
public class Assignment6task17
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int i=1;
   int Sum=0;  
     while(i<=600)
     {
     if(i%7==0&&i%9==0)
     {
     Sum=Sum+i;
     }
     else{}
     i=i+1;
     }
     System.out.println(Sum);
 }
}
