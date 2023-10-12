import java.util.Scanner;

public class Lesson2Ex3 {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите число: ");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println(isPrime(a));
    }

    public static int isPrime(int a) {
        if ( a % 2 == 0 ) {
            System.out.println("Число " + a + " - четное");
        }
        else {
            System.out.println("Число " + a + " - нечетное");
        }
        return a;
    }
}


//Это без возможности ввести свое число через консоль,а класс выше нашел в интернете import java.util.Scanner;
//int a = 53;
//        if(a%2==0){
//            System.out.println("Число " + a + " четное ");
//        }
//        else{
//                System.out.println("Число " + a + " нечетное ");
//        }
