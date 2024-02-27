import java.util.Scanner;

/**
 * How many logs go in the truck?.
 *
 * @author Kevin Csiffary
 * @version 1.0
 * @since 2024-02-26
 */
public final class Logging {
  /** Private constructor to prevent instantiation of this utility class. */
  private Logging() {
    // Prevents instantiation.
  }

  /**
   * Create main function.
   *
   * @param args Command line arguments.
   */
  public static void main(final String[] args) {

    final float SHORT_LOG = 0.25f;
    final float MED_LOG = 0.5f;
    final float LONG_LOG = 1f;

    // Create the scanner.
    Scanner sc = new Scanner(System.in);

    // Get user input.
    System.out.println("Enter the length of the logs (0.25, 0.5, or 1):");
    String logLengthString = sc.nextLine();

    // Setup try catch
    try {
      // Cast the input to a float.
      float logLengthFloat = Float.parseFloat(logLengthString);

      // Check which length the user inputted and output the correct result.
      if (logLengthFloat == LONG_LOG) {
        System.out.print("You can have " + (1100 / 20) / logLengthFloat);
        System.out.println(" logs of length 1m in your truck");
      } else if (logLengthFloat == MED_LOG) {
        System.out.print("You can have " + (1100 / 20) / logLengthFloat);
        System.out.println(" logs of length 0.5m in your truck");
      } else if (logLengthFloat == SHORT_LOG) {
        System.out.print("You can have " + (1100 / 20) / logLengthFloat);
        System.out.println(" logs of length 0.25m in your truck");
        // If none of the accepted values are inputted tell the user.
      } else {
        System.out.println("Please enter either 0.25, 0.5, or 1");
      }
      // Catch any non-decimal input.
    } catch (Exception e) {
      System.out.println("Please enter either 0.25, 0.5, or 1");
    }
  }
}
