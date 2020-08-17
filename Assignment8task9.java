import java.util.Scanner;
public class Assignment8task9
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   int [] array=new int [10];
   for(int i=0;i<array.length;i++)
   {
   System.out.println("Enter number");
   array[i]=meow.nextInt();
   }
   System.out.println("Enter check number");
   int a=meow.nextInt();
   int i=0;
   int flag=0;
   while(i<array.length)
   {
   if(array[i]==a)
   {
   flag=1;
   }
   i++;
   }
   if(flag==1)
   {
   System.out.println("yes");
   }
   else
   {
   System.out.println("no");
   }
 }
}
