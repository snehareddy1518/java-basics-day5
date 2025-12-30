import java.util.Scanner;

public class StudentManagement{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; // number of students
        String[] names = new String[n];
        int[] marks = new int[n];

        // 1. Store student names and marks
        System.out.println("Enter student names and marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " Name: ");
            names[i] = sc.next();

            System.out.print("Student " + (i + 1) + " Marks: ");
            marks[i] = sc.nextInt();
        }

        // 2. Find topper
        int max = marks[0];
        int topperIndex = 0;

        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
                topperIndex = i;
            }
        }

        System.out.println("\nTopper:");
        System.out.println(names[topperIndex] + " with marks " + max);

        // 3. Search student by name
        System.out.print("\nEnter student name to search: ");
        String searchName = sc.next();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Student Found: " + names[i] + ", Marks: " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        // 4. Display students with marks > 75
        System.out.println("\nStudents with marks greater than 75:");
        for (int i = 0; i < n; i++) {
            if (marks[i] > 75) {
                System.out.println(names[i] + " - " + marks[i]);
            }
        }

        // 5. Calculate class average
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        double average = (double) sum / n;
        System.out.println("\nClass Average Marks: " + average);

        // 6. Sort students by marks (Descending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (marks[i] < marks[j]) {
                    int tempMarks = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempMarks;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.println("\nStudents sorted by marks (High to Low):");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }

        sc.close();
    }
}