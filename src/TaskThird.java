import java.util.Scanner;

//TODO: Программа, которая вычисляет факториал числа, введенного пользователем.
public class TaskThird {
    public static void main(String[] args) {

        int factorialNumber;
        int factorialSum = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        factorialNumber = scanner.nextInt();

        for (int i = 1; i <= factorialNumber; i++) {
            factorialSum *= i;
        }
        System.out.println("Факториал числа " + factorialNumber + " равен " + factorialSum);
        scanner.close();
    }
}
