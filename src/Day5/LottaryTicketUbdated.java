package Day5;

import java.util.Arrays;
import java.util.Random;

public class LottaryTicketUbdated {

        private static int MAXLOTTARYNUMBER=69;
        private static final int LENGTH=6;
        static void main(String[] args) {
            int[] ticket=  generateTicketNumbers();
            Arrays.sort(ticket);
           int found = Arrays.binarySearch(ticket,9);
            System.out.println(found);
            printTicketNumbers(ticket);
        }
        public static int[] generateTicketNumbers() {
            int[] ticket = new int[LENGTH];
            Random random = new Random();
            for (int i = 0; i < ticket.length; i++) {
                int randomNumber;
                do {


                    randomNumber = random.nextInt(MAXLOTTARYNUMBER) + 1;

                } while (search(ticket,randomNumber));

                ticket[i]=randomNumber;
            }
                return ticket;
            }
            public static void printTicketNumbers(int [] ticket){
                for (int number : ticket) {
                    System.out.print(number + " | ");
                }}

    /**
     * this method searches for an element in an array
     * @param array array to search through
     * @param numberToSearchFor value to search for
     * @return true if found and false if not found
     */

                public static boolean search(int [] array,int numberToSearchFor){
                    for (int value:array){
                        if (value==numberToSearchFor){
                            return true;
                        }
                    }
                            return false;
                        }
                    }




