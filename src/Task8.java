import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int count = 0;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            count++;
            sum += digit;
            number /= 10;
        }

        System.out.println("Количество цифр: " + count);
        System.out.println("Сумма цифр: " + sum);

    }
    }
