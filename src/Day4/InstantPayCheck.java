package Day4;

import java.util.Scanner;



public class InstantPayCheck {
     static double requiredSalary=20000;
     static double requiredCreditScore=500;
  static   Scanner scanner= new Scanner(System.in);

    static void main(String[] args) {
        //what we have

       double salary= getEmployeeSalary();
        double creditScore = getEmployeeCreditScore();
        boolean qualified= isQualified(salary,creditScore);
         notifyUser(qualified);
         scanner.close();
    }
  static double getEmployeeSalary(){
    System.out.println("Enter your Salary ");
    double salary = scanner.nextDouble();

   return salary;

  }
  static double getEmployeeCreditScore(){

      System.out.println("Enter your Score ");
      double creditScore = scanner.nextDouble();

      return creditScore;
  }

  static boolean isQualified(double salary,double creditScore) {
      if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
          return true;
      } else {
          return false;
      }
  }
   static void notifyUser(boolean qualified){
        if(qualified){
            System.out.println("congrats , you are qualified for the  loan");
        }
        else {
            System.out.println("Sorry  , you are not qualified ");
        }




  }
}
