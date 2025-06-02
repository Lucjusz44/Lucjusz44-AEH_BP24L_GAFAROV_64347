import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

/**
 * Lab 11 Solution - Student Grade Processing System
 * Demonstrates object-oriented programming with Java collections
 */
public class Lab11 {
    
    public static void main(String[] args) {
        // Initialize student data
        List<Student> students = createSampleStudents();
        
        // Process and display results
        displayTopPerformer(students);
        displayClassStatistics(students);
        displayStudentRoster(students);
    }

    private static List<Student> createSampleStudents() {
        return Arrays.asList(
            new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
            new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
            new Student("54321", "Pawel", "Wishiewski", Arrays.asList(2, 3, 2, 4)),
            new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );
    }

    private static void displayTopPerformer(List<Student> students) {
        System.out.println("\n=== TOP PERFORMING STUDENT ===");
        students.stream()
            .max(Comparator.comparingDouble(Student::calculateAverage))
            .ifPresent(top -> System.out.println(top.getFormattedInfo()));
    }

    private static void displayClassStatistics(List<Student> students) {
        System.out.println("\n=== CLASS STATISTICS ===");
        double average = students.stream()
            .mapToDouble(Student::calculateAverage)
            .average()
            .orElse(0.0);
        System.out.printf("Class Average: %.2f%n", average);
    }

    private static void displayStudentRoster(List<Student> students) {
        System.out.println("\n=== STUDENT ROSTER (ALPHABETICAL) ===");
        students.stream()
            .sorted(Comparator.comparing(Student::getLastName))
            .forEach(s -> System.out.println(s.getFormattedInfo()));
    }
}

class Student {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final List<Integer> grades;

    public Student(String id, String firstName, String lastName, List<Integer> grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public double calculateAverage() {
        if (grades == null || grades.isEmpty()) return 0.0;
        return grades.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
    }

    // Getters
    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public List<Integer> getGrades() { return grades; }

    public String getFormattedInfo() {
        return String.format("%-12s %-15s (ID: %s) - Average: %5.2f",
            firstName, lastName, id, calculateAverage());
    }
}
