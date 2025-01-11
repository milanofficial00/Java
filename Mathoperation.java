import java.util.Scanner;
public class Mathoperation{
    public static int num1;
    public static int num2;
  public static void input()
    {
        System.out.println("enter two numbers");
        Scanner sc=new Scanner(System.in);
         num1=sc.nextInt();
         num2=sc.nextInt();
    }
    public static int addition(int num1,int num2){
     return num1+num2;
    }
    public static int subtraction(int num1,int num2){
        return num1-num2;
       }
       public static int multiplication(int num1,int num2){
        return num1*num2;
       }
       public static int division(int num1,int num2){
        if(num2==0)
        {
          System.out.println("cant divide by zero");
          return 0;
        }
        return num1/num2;
       }

      
public static void main(String[] args)
{
 while (true)
 {
  System.out.println("Enter the number for : \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.division \n 5.Quit" );  
 Scanner sc=new Scanner(System.in);
int choise =sc.nextInt();
 switch (choise) {
    case 1:
     input();
     System.out.println("addition of two numbers:" + addition(num1,num2));
     break;
   case 2:
   input();
   System.out.println("subtraction ="+subtraction(num1,num2));
   break;
   case 3:
   input();
   System.out.println("multiplication ="+multiplication(num1,num2));
   break;
case 4:
input();
System.out.println("division ="+division(num1,num2));
break;
case 5:
System.exit(0);
break;
default:
System.out.println("Invalid Choices");
} 
 }
}
}
