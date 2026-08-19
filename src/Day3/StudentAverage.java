package Day3;

import java.util.Scanner;

public class StudentAverage {
    static void main(String[] args) {
        //intialize what we have
        int numberofstudent = 2;
        int numberofcourses = 3;
        Scanner scanner=new Scanner(System.in);
        //what we need

        for(int i=0;i<numberofstudent;i++){
            double total =0;
            for(int j=0;j<numberofcourses;j++){
           System.out.println("Enter the grade of course "+(j+1)+ " for student "+(i+1));
                double score = scanner.nextDouble();
                total+=score;
            }
            System.out.println("The average score of student "+(i+1)+" is "+total/numberofcourses);

        }
        scanner.close();
    }
}
