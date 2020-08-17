import java.util.Scanner;
public class Assignment8task5
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
    for(int i=0;i<myarray.length;i++)
    {  if(myarray[i]%2==0)
    {
     System.out.println(myarray[i]);
     i=myarray.length;
    }
    }
  }
}

