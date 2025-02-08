import java.util.Scanner;

//TODO: Программа, которая проверяет, является ли число, введенное пользователем, простым.
public class TaskSeven {
    public static void main(String[] args) {

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }

        if (count <= 2) {
            System.out.println("Число " + number + " — простое");
        } else {
            System.out.println("Число " + number + " — не простое");
        }
    }
}
