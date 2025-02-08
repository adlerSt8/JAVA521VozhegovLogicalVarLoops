import java.util.Scanner;

//TODO: Программа, которая вычисляет факториал числа, введенного пользователем.
public class TaskThird {
    public static void main(String[] args) {

        int factorialNumber;
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        factorialNumber = scanner.nextInt();


        if (factorialNumber >= 0) {
            for (int i = 1; i <= factorialNumber; i++) {
                result *= i;
            }
            System.out.println("Факториал числа " + factorialNumber + " равен " + result);
        } else {
                System.out.println("Ошибка! Факториал не может быть отрицательным");
            }
        scanner.close();
    }
}
