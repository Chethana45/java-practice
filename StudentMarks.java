import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList to store marks
        ArrayList<Integer> marksList = new ArrayList<>();

        // 1. Add marks to the list
        System.out.println("Enter marks of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark of student " + (i + 1) + ": ");
            int mark = sc.nextInt();
            marksList.add(mark);
        }

        // 2. Display all the marks
        System.out.println("\nMarks of all students:");
        for (int mark : marksList) {
            System.out.print(mark + " ");
        }
        System.out.println();

        // 3. Display the highest and lowest marks
        int highest = Collections.max(marksList);
        int lowest = Collections.min(marksList);
        System.out.println("\nHighest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);

        // 4. Remove a mark (by value or index)
        System.out.println("\nDo you want to remove by (1) Index or (2) Value?");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter index (0 to " + (marksList.size() - 1) + "): ");
            int index = sc.nextInt();
            if (index >= 0 && index < marksList.size()) {
                marksList.remove(index);
                System.out.println("Mark at index " + index + " removed successfully.");
            } else {
                System.out.println("Invalid index!");
            }
        } else if (choice == 2) {
            System.out.print("Enter mark value to remove: ");
            int value = sc.nextInt();
            if (marksList.remove(Integer.valueOf(value))) {
                System.out.println("Mark " + value + " removed successfully.");
            } else {
                System.out.println("Mark not found in the list.");
            }
        } else {
            System.out.println("Invalid choice!");
        }

        // 5. Display the list again after removal
        System.out.println("\nMarks after removal:");
        for (int mark : marksList) {
            System.out.print(mark + " ");
        }
        System.out.println();

        sc.close();
    }
}
