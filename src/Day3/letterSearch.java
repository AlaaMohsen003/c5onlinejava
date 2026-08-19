package Day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class letterSearch {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text ");
        String text = scanner.nextLine();
        scanner.close();

        boolean letterFound = false;
        int position = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentletter = text.charAt(i);
            if (currentletter == 'A' || currentletter == 'a') {
                letterFound = true;
                position = i + 1;
                break;
            }
        }
        if (letterFound) {
            System.out.println("this text contains letter A at position" + position);

        } else {
            System.out.println("Letter A was not found");
        }
    }}
