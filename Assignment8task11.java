import java.util.Scanner;
  public class a8p11
{
  public static void main(String [] args)
  {
    Scanner meow = new Scanner(System.in);
    int input[]= new int[10];
    int num = 0;
    boolean duplicate = false;
    for(int i=0; i<input.length; i++)
    {
      num = meow.nextInt();
      duplicate = false;
      
      for(int j=0; j<i; j++)
      {
        if(num == input[j])
        {
          duplicate = true;
          break;
        }
        }
        if(duplicate == true)
        {
          System.out.println("there is a duplicate");
          i--;
        }
          else
          {
            input[i]=num;
          }
      
    }
  }
}
