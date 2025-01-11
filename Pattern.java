public class Pattern {
    public static void main(String[] args) {
        int i,j;
        //pattern first
        for( i=1;i<=7;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
          }
          //pattern second
          for(i=1;i<=5;i++)
          {
              for(j=1;j<=i;j++)
              {
                  System.out.print("*");
              }
              System.out.println();
          }
          //pattern third
          for ( i = 5; i >= 1; i--) { 
            
            for ( j = 1; j <= 5 - i; j++) {
                System.out.print(" "); 
            }
           
            for ( j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        //pattern fourth
        for (i = 9; i >= 1; i--) { 
            for (j = 9; j >=10- i; j--) { 
                System.out.print(j); 
            }
            System.out.println(); 
        }
    }
}
