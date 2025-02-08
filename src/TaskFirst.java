import java.util.Scanner;
//TODO: Программу, которая принимает два числа от пользователя и выводит их сумму и среднее значение.
public class TaskFirst {
    public static void main(String[] args) {

        int numberFirst;
        int numberSecond;
        int sumNumber;
        double averageValue;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        numberFirst = scanner.nextInt();
        System.out.print("Введите второе число: ");
        numberSecond = scanner.nextInt();

        sumNumber = numberFirst + numberSecond;
        averageValue = (double) sumNumber / 2;
        System.out.println("Сумма: " + sumNumber);
        System.out.println("Среднее значение: " + averageValue);

        scanner.close();
    }
}
