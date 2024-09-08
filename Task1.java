public class Task1 {//Program for developing student management system for a university
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "Amaan", 20, "Guvi");
            System.out.println("Student created:" + student1);
        } catch (AgeNotWithInRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
        try {
            Student student2 = new Student(1, "Amaan$", 20, "Guvi");
            System.out.println("Student created:" + student2);
        } catch (AgeNotWithInRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
        try {
            Student student3 = new Student(1, "Amaan", 22, "Guvi");
            System.out.println("Student created:" + student3);
        } catch (AgeNotWithInRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
class AgeNotWithInRangeException extends Exception{
    public AgeNotWithInRangeException(String message) {
        super(message);
    }
}
class NameNotValidException extends Exception{
    public NameNotValidException(String message) {
        super(message);
    }
}
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithInRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithInRangeException("Age not within range 15-21:");
        }
        if (!name.matches("[a-zA-z]+")) {
            throw new NameNotValidException("Name not valid:");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
