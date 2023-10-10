import java.util.Scanner;

public class Lesson2Ex4 {
    public static void main(String[] args) {
        float a = 0;
        float b = 0;
        float c = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        a = input.nextFloat();

        System.out.print("Введите второе число: ");
        b = input.nextFloat();

        System.out.print("Введите третье число: ");
        c = input.nextFloat();

        System.out.println((a < b && a < c) ? ("Число " + a + " меньшее"):("Число " + a + " не самое меньшее"));

        System.out.println((b < a && b < c) ? ("Число " + b + " меньшее"):("Число " + b + " не самое меньшее"));

        System.out.println((c < a && c < b) ? ("Число " + c + " меньшее"):("Число " + c + " не самое меньшее"));
    }
}

