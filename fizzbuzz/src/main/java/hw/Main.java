package hw;

public class Main {
  public static void main(String[] args) {

    int n = 17;

    try {
      n = Integer.parseInt(args[0]);

    } catch (NumberFormatException e) {
      System.out.println("Unable to parse input into an int: " + e.getMessage());
      //Exit due to an error
      System.exit(1);
    }

    fizzbuzz.fizzBuzz(n);
  }
}
