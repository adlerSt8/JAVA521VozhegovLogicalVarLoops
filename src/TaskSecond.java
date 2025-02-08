import java.util.Scanner;

//TODO: Программа, которая проверяет, является ли введенное пользователем число четным или нечетным.
public class TaskSecond {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        number = scanner.nextInt();
        String evenOdd = number % 2 == 0? "Число " + number + " — четное" : "Число " + number + " — нечетное";

        System.out.println(evenOdd);
        scanner.close();
    }
}
