import java.util.Scanner;
public class Assignment8task10
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int [] array =new int[10];
   for(int a=0;a<array.length;a++)
   {
   System.out.println("Enter input");
   array[a]=meow.nextInt();
   for (int b=0;b<=a;b++)
   {
     System.out.print(array[b]+" ");
    }
   System.out.println();
   }
 }
}
