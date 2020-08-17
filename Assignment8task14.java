import java.util.Scanner;
public class Assignment8task14
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
   int loc1=0;
   int min =array[0];
   int loc2=0;
   for(int a=1;a<array.length;a++)
   {
   if(max<array[a])
   {
     max=array[a];
     loc1=a;
   }
   else if(min>array[a])
   {
     min=array[a];
     loc2=a;
   }
   }
   System.out.println(max + "maxlocation"+loc1);
   System.out.println(min + "minlocation"+loc2);
   }
}
