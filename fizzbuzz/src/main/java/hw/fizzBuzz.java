package hw;

public class fizzBuzz {
    public static void main(final String[] args) {
        
        int n = 17;
        
        for (int i = 1; i <= n; i++) {
            int x = i % 3;
            int y = i % 5;
            
            if (x == 0 && y == 0) {
                
                System.out.println("fizz buzz");
                
            } else if (x == 0) {
                
                System.out.println("fizz");
                
            } else if (y == 0) {
                
                System.out.println("buzz");
                
            } else {
                
                System.out.println(i);
                
            }

        }

    }
    
    
}