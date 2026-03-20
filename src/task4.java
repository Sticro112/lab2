import java.util.Scanner;

public class task4 {
    public static void execute(Scanner scan) {
        System.out.println("\n--- Завдання 4:  ---");
        System.out.print("Введіть x та y для квадранта: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        if (x > 0 && y > 0) System.out.println("I квадрант");
        else if (x < 0 && y > 0) System.out.println("II квадрант");
        else if (x < 0 && y < 0) System.out.println("III квадрант");
        else if (x > 0 && y < 0) System.out.println("IV квадрант");
        else System.out.println("Точка на осі або в початку координат");
    }
}