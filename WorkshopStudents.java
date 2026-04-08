import java.util.*;

public class WorkshopStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two sets for Java and Python workshop students
        HashSet<String> javaWorkshop = new HashSet<>();
        HashSet<String> pythonWorkshop = new HashSet<>();

        // 1. Input names in both sets
        System.out.print("Enter number of students who attended Java Workshop: ");
        int n1 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter names of students who attended Java Workshop:");
        for (int i = 0; i < n1; i++) {
            javaWorkshop.add(sc.nextLine());
        }

        System.out.print("\nEnter number of students who attended Python Workshop: ");
        int n2 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter names of students who attended Python Workshop:");
        for (int i = 0; i < n2; i++) {
            pythonWorkshop.add(sc.nextLine());
        }

        // 2. Find intersection (students who attended both)
        HashSet<String> bothWorkshops = new HashSet<>(javaWorkshop);
        bothWorkshops.retainAll(pythonWorkshop); // retain only common elements

        // 3. Display the result
        System.out.println("\nStudents who attended both Java and Python Workshops:");
        if (bothWorkshops.isEmpty()) {
            System.out.println("No students attended both workshops.");
        } else {
            for (String name : bothWorkshops) {
                System.out.println(name);
            }
        }

        sc.close();
    }
}
