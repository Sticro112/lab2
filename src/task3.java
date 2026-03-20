import java.util.Scanner;

public class task3 {
    public static void execute(Scanner scan) {
        System.out.println("\n--- Завдання 3: ---");
        System.out.print("Введіть a, b, c для квадратного рівняння: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("Два корені: x1 = %.2f, x2 = %.2f\n", x1, x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.printf("Один корінь: x = %.2f\n", x);
        } else {
            System.out.println("Коренів немає (D < 0)");
        }
    }
}