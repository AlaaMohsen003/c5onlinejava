package Day2;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        boolean response;
        //what we need
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("please enter first number");
            int num1 = scanner.nextInt();

            System.out.println("please enter second number");
            int num2 = scanner.nextInt();


            int sum = num1 + num2;
            System.out.println("the sum is" + sum);
            System.out.println("Do you want to continue ? 1-true 2-false");
            response = scanner.nextBoolean();

        }while (response);
        scanner.close();
        }
    }


