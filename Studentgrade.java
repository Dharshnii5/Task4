import java.util.HashMap;

public class Studentgrade {
    private HashMap<String, Integer> studentGrades;

    public Studentgrade () {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student with their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Added student: " + name + ", Grade: " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            int removedGrade = studentGrades.remove(name);
            System.out.println("Removed student: " + name + ", Grade: " + removedGrade);
        } else {
            System.out.println("Student with name '" + name + "' not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Student: " + name + ", Grade: " + grade);
        } else {
            System.out.println("Student with name '" + name + "' not found.");
        }
    }

    public static void main(String[] args) {
        Studentgrade gradeMap = new Studentgrade();

        // Adding students with their grades
        gradeMap.addStudent("Yamini", 85);
        gradeMap.addStudent("Hari", 90);
        gradeMap.addStudent("Aadhi", 78);

        // Displaying a student's grade
        gradeMap.displayGrade("Yamini");

        // Removing a student
        gradeMap.removeStudent("Hari");

        // Displaying a removed student (to show it's not found)
        gradeMap.displayGrade("Hari");
    }
}