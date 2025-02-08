import java.util.Scanner;

//TODO: Программа, которая проверяет, является ли введенное пользователем число четным или нечетным.
public class TaskSecond {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            String evenOdd = number % 2 == 0
                    ? "Число " + number + " — четное"
                    : "Число " + number + " — нечетное";
        } else {
            System.out.println("Ошибка! Введено не число!");
        }
        scanner.close();
    }
}
