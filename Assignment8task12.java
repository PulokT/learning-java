import java.util.Scanner;
public class Assignment8task12
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
   int max =array[0];
   for(int a=1;a<array.length;a++)
   {
   if(max<array[a])
   {
     max=array[a];
   }
   }
   System.out.println(max);
 }
}
