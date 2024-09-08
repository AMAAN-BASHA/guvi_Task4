public class Task2 {//program to check the voter age  is valid or not:
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Amaan", 25);
            System.out.println("Voter created: " + voter1);
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }

        try {
            Voter voter2 = new Voter(2, "Jane", 17);
            System.out.println("Voter created: " + voter2);
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }

        try {
            Voter voter3 = new Voter(3, "Doe", 18);
            System.out.println("Voter created: " + voter3);
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }
    }
}
class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}

class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterId=" + voterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
