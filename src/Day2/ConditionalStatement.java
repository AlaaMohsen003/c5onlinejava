package Day2;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //  System.out.println("please Enter Number To check");
        //    int numberToCheck = scanner.nextInt();
        //   if (numberToCheck % 2 == 0) {
        //      System.out.println("Even");
        //  } else {
        //     System.out.println("odd");

        // }
        //  scanner.close();
        // }
        //   Scanner scanner = new Scanner(System.in);
        //  System.out.println("please Enter Number To check");
        //   int numberToCheck = scanner.nextInt();
        //    if (numberToCheck >0){
        //       System.out.println("positive");
        // }
        // else if(numberToCheck<0){
        //       System.out.println("Negative");
        //  }else{
        //    System.out.println("Zero");
        //  }
     //   Scanner scanner = new Scanner(System.in);
       // System.out.println("please Enter first number");
       // int num1 = scanner.nextInt();
       // System.out.println("please Enter second number");
       // int num2 = scanner.nextInt();

       // System.out.println("please Enter second number");
       // int num3 = scanner.nextInt();
       // if (num1 > num2 && num1 > num3) {
         //   System.out.println("the first number is the largest ");
       // } else if (num2 > num1 && num2 > num3) {
        //    System.out.println("the second number is the largest ");
        //} else {
       //     System.out.println("the third number is the largest ");
       //
        // }
          //  scanner.close();
   //
 Scanner scanner = new Scanner(System.in);
       System.out.println("please Enter Day Number");

       int dayNumber=scanner.nextInt();
        //if(dayNumber==1) {
        //    System.out.println("saturday");
       // }

        //else if(dayNumber==2) {
          //  System.out.println("sunday");
        //}
       // else if(dayNumber==3){
          //  System.out.println("monday");
      //  }
      //  else if(dayNumber==4) {
       //     System.out.println("tuesday");
      //  }
      // else if(dayNumber==5) {
        //    System.out.println("wednesday");}
       // else if(dayNumber==6){
            //System.out.println("thursday");
      //  }
      //  else if(dayNumber==7){
         //   System.out.println("friday");
       // }
       // else {
        //    System.out.println("day is in valid");

       // }
       // scanner.close();


        switch (dayNumber){
            case 1 : System.out.println("saturday");break;
            case 2 : System.out.println("sunday");break;
            case 3 : System.out.println("monday");break;
            case 4 : System.out.println("tuessday");break;
            case 5: System.out.println("wednesday");break;
            case 6 : System.out.println("thursday");break;
            case 7 : System.out.println("friday");break;
            default:System.out.println("invalid Day Number");



        }
    }
}












