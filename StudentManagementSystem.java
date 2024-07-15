class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws NameNotValidException, AgeNotWithinRangeException {
        if (age < 15||age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21 years)");
        }

        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name can only contain alphabets");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public String toString() {
        return "Roll No: " + rollNo + "\nName: " + name + "\nAge: " + age + "\nCourse: " + course;
    }
}

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1,"Sam",19,"ComputerScience");
            Student student2 = new Student(2, "Dharshni", 20, "Mathematics");

            System.out.println("Student 1 details:");
            System.out.println(student1);
            // toString() method can be implemented to print student details

            System.out.println("\nStudent 2 details:");
            System.out.println(student2);
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


