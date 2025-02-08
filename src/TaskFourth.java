import java.util.Scanner;

//TODO: Программа, которая выводит таблицу умножения для числа, введенного пользователем.
public class TaskFourth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
        scanner.close();
    }
}
