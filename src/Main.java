import java.util.Scanner;
import factorial.Factorial;

class Hello{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextInt();

        Factorial factorial = new Factorial(num);
        System.out.println("Factorial: " + factorial.getFactorial());
    }
}