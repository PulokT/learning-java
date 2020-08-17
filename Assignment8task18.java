import java.util.Scanner;
public class Assignment8task18
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int [] array =new int [10];
   for(int i=0;i<15;i++)
   {
   System.out.println("Enter number");
   array[meow.nextInt()]++;
   }
   for(int i=0;i<10;i++)
   {
   System.out.println(i+"was entered"+array[i]+"times");
   }
 }
}
