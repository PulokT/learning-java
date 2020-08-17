import java.util.Scanner;
public class Assignment8task15
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
   for(int b=0;b<array.length;b++)
   {
   int x=b+1;
   while(x<array.length)
   {
   if(array[b]>array[x])
   {
   int temp=array[x];
   array[x]=array[b];
   array[b]=temp;
   }
    x++;
   }
   }
   for(int z=0;z<array.length;z++)
   {  
   System.out.print(array[z]);
   }
   System.out.println();
 }
}
     
