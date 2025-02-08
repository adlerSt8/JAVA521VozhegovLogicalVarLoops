import java.util.Scanner;

//TODO: Программа, которая выводит таблицу умножения для числа, введенного пользователем.
public class TaskFourth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + number * i);
            }
        } else {
            System.out.println("Ошибка! Введено не число!");
        }

        scanner.close();
    }
}
