import java.util.Scanner;
public class Assignment8task19
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int [] array =new int[10];
   for(int a=0;a<array.length;a++)
   {
   System.out.println("Enter input");
   array[a]=meow.nextInt();
   }
   for(int a=0;a<array.length;a=a+2)
   {
   System.out.print(array[a]+" ");
   }
   for(int a=1;a<array.length;a=a+2)
   {
   System.out.print(array[a]+" ");
   }
   System.out.println();
 }
}
