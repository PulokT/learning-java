import java.util.Scanner;
public class Assignment8task13
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int [] array =new int[5];
   for(int a=0;a<array.length;a++)
   {
   System.out.println("Enter input");
    array[a]=meow.nextInt();
   }
   int min =array[0];
   int loc=0;
   for(int a=1;a<array.length;a++)
   {
   if(min>array[a])
   {
     min=array[a];
     loc=a;
   }
   }
   System.out.println(min + "location"+loc);
 }
}
