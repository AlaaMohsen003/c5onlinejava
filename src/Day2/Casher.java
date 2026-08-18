package Day2;

import java.util.Scanner;

public class Casher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please Enter Number of items:");
        int numberOfItems=scanner.nextInt();
        double total = 0;
        for(int i=0;i<=numberOfItems;i++){
            System.out.println("please enter the price of item"+i);
            double price = scanner.nextDouble();
            total+=price;
        }
        scanner.close();
        System.out.println("the total price is "+total);

    }
}
