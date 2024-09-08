import java.util.HashMap;
import java.util.Scanner;

public class Task4 {//program to create a hashmap to display the grade;
    private HashMap<String, Integer> grades = new HashMap<>();

    public void addStudent(String name, int grade) {
        grades.put(name, grade);
    }

    public void removeStudent(String name) {
        grades.remove(name);
    }

    public void displayGrade(String name) {
        Integer grade = grades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        Task4 sg = new Task4();
        Scanner scanner = new Scanner(System.in);

        sg.addStudent("Amaan", 85);
        sg.addStudent("Basha", 90);

        System.out.print("Enter student name to display grade: ");
        String name = scanner.next();
        sg.displayGrade(name);

        System.out.print("Enter student name to remove: ");
        String nameToRemove = scanner.next();
        sg.removeStudent(nameToRemove);
        System.out.println(nameToRemove + " has been removed.");

        System.out.print("Enter student name to display grade: ");
        name = scanner.next();
        sg.displayGrade(name);

        scanner.close();
    }
}
