import java.util.Scanner;
public class a8p3
{
  public static void main(String[] args)
  {
    Scanner meow= new Scanner(System.in);
    int[] myArray = new int[10];
    for(int i=0;i<myArray.length;i++)
    {
      myArray[i]= meow.nextInt();
    }
    
    
    for(int i =myArray.length-1; i>=0; i--)
      System.out.println(myArray[i]);
    }
  }


      