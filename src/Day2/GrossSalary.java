package Day2;

import java.util.Scanner;

public class GrossSalary {
   public static void main(String[] args) {
       int rate=15;
       int maxWeeklyHours=40;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter working hours");
       double workingHours=scanner.nextDouble();
       while (workingHours>maxWeeklyHours){
           System.out.println("please enter value between 1 and 40");
           workingHours=scanner.nextDouble();
       }
       scanner.close();
double grossSalary=workingHours*rate;
       System.out.println("the gross salary is "+grossSalary+"$");
    }
}
