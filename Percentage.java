import java.util.Scanner;

public class Percentage {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Java: ");
        int javaMarks = sc.nextInt();
        System.out.print("Enter marks for C: ");
        int cMarks = sc.nextInt();
        System.out.print("Enter marks for Math: ");
        int mathMarks = sc.nextInt();
        System.out.print("Enter marks for DSA: ");
        int dsaMarks = sc.nextInt();
        System.out.print("Enter marks for DBMS: ");
        int dbmsMarks = sc.nextInt();

        int totalMarks = javaMarks + cMarks + mathMarks + dsaMarks + dbmsMarks;
        System.out.println("students marks:" + totalMarks);
       if(javaMarks>40 && cMarks>40 && mathMarks>40 && dsaMarks>40 && dbmsMarks>40)
       {
        float percentage = totalMarks/5;
        System.out.println("passed with percentage :" +percentage);
       }
       else{
        System.out.println("failed");
       }
}
}
