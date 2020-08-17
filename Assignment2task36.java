import java.util.Scanner;
public class Assignment2task36
{
 public static void main (String[]args)
 {
   Scanner meow=new Scanner(System.in);
   System.out.println("enter grade of CSE 110");
   double CSE=meow.nextDouble();
   System.out.println("enter grade of ENG 091");
   double ENG=meow.nextDouble();
   System.out.println("enter grade of MAT 110");
   double MAT=meow.nextDouble();
   System.out.println("enter grade of PHY 111");
   double PHY=meow.nextDouble();
   int credits=3+0+3+3;
   double points=(CSE*3)+(ENG*0)+(MAT*3)+(PHY*3);
   double GPA=points/credits;
   System.out.println(GPA); 
  }  
}   
