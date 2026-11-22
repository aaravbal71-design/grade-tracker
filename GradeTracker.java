import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n1) Add grade  2) Average  3) Highest  4) Quit");
            System.out.print("Choose: ");
            int choice = in.nextInt();

            if (choice == 1) {
                System.out.print("Enter grade: ");
                grades.add(in.nextDouble());
            } else if (choice == 2) {
                System.out.println("Average: " + average(grades));
            } else if (choice == 3) {
                System.out.println("Highest: " + highest(grades));
            } else if (choice == 4) {
                running = false;
            }
        }
    }

    public static double average(ArrayList<Double> grades) {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    public static double highest(ArrayList<Double> grades) {
        if (grades.isEmpty()) {
            return 0;
        }
        double max = grades.get(0);
        for (double g : grades) {
            if (g > max) {
                max = g;
            }
        }
        return max;
    }
}
