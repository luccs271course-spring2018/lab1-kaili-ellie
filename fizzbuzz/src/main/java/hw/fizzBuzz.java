package hw;

public class fizzBuzz {
    public static void main(final String[] args) {
        
        int n = Integer.parseInt(args[0]);
        
        String[] returnArray = fizzBuzzArray(n);
        
        return returnArray;

    }
    
    public static String[] fizzBuzzArray(final int n) {
        
        String[] list = new String[n];
        
        for (int i = 1; i <= n; i++) {
            int x = i % 3;
            int y = i % 5;
            
            if (x == 0 && y == 0) {
                
                list[i]="fizz buzz";
                
            } else if (x == 0) {
                
                list[i]="fizz";
                
            } else if (y == 0) {
                
                list[i]="buzz";
                
            } else {
                
                list[i]=Integer.toString(i);
                
            }

        }
        
        return list;
        
    }
    
    
}