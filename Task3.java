import java.util.Scanner;

public class Task3 {//program to store name of weekday in an array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Enter day index (0-6): ");
        int index = scanner.nextInt();

        try {
            System.out.println("Day: " + days[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day index. Please enter a number between 0 and 6.");
        }

        scanner.close();
    }
}
