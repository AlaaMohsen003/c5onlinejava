package Day5;

import java.util.Random;

public class LottaryTicketUbdated {

        private static int MAXLOTTARYNUMBER=69;
        private static final int LENGTH=6;
        static void main(String[] args) {
            int[] ticket=  generateTicketNumbers();
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
                public static boolean search(int [] array,int numberToSearchFor){
                    for (int value:array){
                        if (value==numberToSearchFor){
                            return true;
                        }
                    }
                            return false;
                        }
                    }




