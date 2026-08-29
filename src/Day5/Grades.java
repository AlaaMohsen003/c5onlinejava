package Day5;

import java.util.Scanner;

public class Grades {
    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Enter the number of grades ");
        // int numberOfGrades
        grades = new int[scanner.nextInt()];
        getGrades();
        printGrades();
        System.out.println(" the average is " + String.format("%.2f", calculateAvg()));
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println(" Enter grade " + (i + 1));
            grades[i] = scanner.nextInt();
        }

    }

    public static void printGrades() {
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    public static double calculateAvg() {
        return calculateSum() / grades.length;

    }

    public static int calculateSum() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }
    public static int getHighest(){
        int highst = grades[0];
        for (int grade:grades){
            if (grade>highst){
                highst=grade;
            }
        }
        return highst;
    }
    public static int getLoewst(){
        int lowest= grades[0];
        for (int grade:grades){
            if (grade<lowest) {
                lowest = grade;
            }}
        return lowest;
}}