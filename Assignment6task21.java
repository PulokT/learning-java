import java.util.Scanner;
public class Assignment6task21
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int i =14;
   int sum =0;
   while(i>9&&i<300){
     sum=sum+i;
     i=i+7;
   }
     System.out.println(sum);
 }
}
