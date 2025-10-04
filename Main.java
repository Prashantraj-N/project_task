import java.util.Scanner;
public class TaskChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subtasks: ");
        int subTasks = sc.nextInt();
        if (subTasks > 5) {
            System.out.println("Large");
        }
        sc.close();
    }
}
