import java.util.Scanner;
public class Leapyear {
    public static void main (String[] args)
    {
    System.out.println("Enter the year you want to check the leap year");
    Scanner sc= new Scanner(System.in);
    int year=sc.nextInt();
    if(year%400 == 0||year%4==0&& year%400!=0 ){
       System.out.println("the entered year is leap year");
    }
    else{
        System.out.println("the entered year is not leap year");
    }
    }

    
}
