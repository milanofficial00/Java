import java.util.Scanner;
public class Largestamongthree {
    public static void main(String[] args)
    {
      System.out.println("Enter three numbers you want to check the greatest");
      Scanner sc= new Scanner(System.in);
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      int num3=sc.nextInt();
      if( num1 > num2 && num1 > num3 )
      {
        System.out.println(num1 +": is the greatest");
      }

      else if(num2 > num1 && num2 > num3)
      {
        System.out.println(num2 +": is the greatest");
      }

      else
      {
          System.out.println(num3 +": is the greatest");
      }
    }
}
