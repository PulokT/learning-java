import java.util.Scanner;
public class Assignment8task2
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int [] myarray=new int[10];
   for(int i=0;i<myarray.length;i++)
   {
   System.out.println("Input a number");
   myarray[i]=meow.nextInt();
   }
    System.out.println("Input a number from 0to9");
    int x=meow.nextInt();
     System.out.println(myarray[x]);
 }
}
