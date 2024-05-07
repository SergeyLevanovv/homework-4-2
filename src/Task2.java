import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк треугольника: ");
        int rows = scanner.nextInt();

        System.out.println("Заполненный треугольник:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Пустой треугольник:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < rows; k++) {
                if (i == 0 || k == i || k == rows - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
