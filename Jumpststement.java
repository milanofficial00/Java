public class Jumpststement {
    public static void main(String[] args) {
        
        //'break'
        System.out.println("Using 'break':");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; 
            }
            System.out.println(i);
        }
        
        System.out.println(); 
        
        //  'continue'
        System.out.println("Using 'continue':");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; 
            }
            System.out.println(i);
        }
        // return
        int result = add();
        System.out.println("using return");
        System.out.println("The sum is: " + result);
        
}
//return ststement
public static int add() {
    int a = 5; 
    int b = 10; 
    return a + b;
}
}

