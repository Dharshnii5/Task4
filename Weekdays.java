
    import java.util.InputMismatchException;
import java.util.Scanner;

    public class Weekdays {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            try {
                System.out.println("Enter a day position (0-6): ");
                int dayPosition = scanner.nextInt();

                if (dayPosition < 0 || dayPosition > 6) {
                    throw new IllegalArgumentException("Day position is out of range (0-6)");
                }

                System.out.println("Day name: " + weekdays[dayPosition]);
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter an integer between 0 and 6.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }

