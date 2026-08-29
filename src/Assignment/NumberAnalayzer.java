package Assignment;
import java.util.Scanner;
public class NumberAnalayzer {
// Prints the numbers starting from 10 and going down to 1.


      // Method 1: Print numbers from 10 to 1 // public static void printNumbersDescending() {
      //   for (int i = 10; i >= 1; i--) {
     //      System.out.println(i);     }
    //   }static void main(String[] args) {
      // printNumbersDescending();
  // }}
     // Displays numbers from 1 to 10 and identifies each one as even or odd
    //  static void main(String[] args) {
//printEvenOrOdd();
//      }
//
//    public static void printEvenOrOdd() {
//      for (int i = 1; i <= 10; i++) {
//       if (i % 2 == 0) {
//               System.out.println(i + " -> Even");
//           } else {
//             System.out.println(i + " -> Odd");
//
//  }}}}
//
//public static String checkNumberType(int number) {
//
//    if (number > 0) {
//        return "Positive";
//    } else if (number < 0) {
//        return "Negative";
//    } else {
//        return "Zero";
//    }
//}
//
//public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Enter a number: ");
//int number = scanner.nextInt();

    //System.out.println(checkNumberType(number));

//   scanner.close();
//}}

    public static int calculateSum(int number1, int number2) {

        return number1 + number2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Sum = " + calculateSum(number1, number2));

        scanner.close();
    }}