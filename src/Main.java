import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int tempNumber = number;
        int digitValue;
        int total = 0;


        while (number != 0){
            digitValue = number % 10;
            number /= 10;
            total += digitValue;
        }
        System.out.print(total);

        }

    }
