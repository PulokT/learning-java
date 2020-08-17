import java.util.Scanner;
public class Assignment8task1
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int [] myarray=new int[3];
   int sum=0;
   for(int i=0;i<myarray.length;i++)
   {
   System.out.println("Input a number");
   myarray[i]=meow.nextInt();
   sum=sum+myarray[i];
   }
   for(int i=0;i<myarray.length;i++)
   {
   System.out.println(myarray[i]);
   }
   System.out.println(sum);
 }
}

