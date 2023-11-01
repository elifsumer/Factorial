import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(factorialFunction(sc.nextInt()));
    }

    public static int factorialFunction(int number) {
        if (number == 1)
         return 1;
        return number*factorialFunction(number-1);
        }

    }
