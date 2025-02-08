import java.util.Scanner;

//TODO: Программа, которая выводит числа от N до 1 в обратном порядке.
public class TaskFifth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            while (number > 0) {
                System.out.println(number);
                number --;
            }
        } else {
            System.out.println("Ошибка! Введено не число!");
        }
        scanner.close();
    }
}
