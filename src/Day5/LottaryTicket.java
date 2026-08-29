package Day5;

import java.util.Random;

public class LottaryTicket {
    private static int MAXLOTTARYNUMBER=69;
    private static final int LENGTH=6;
    static void main(String[] args) {
      int[] ticket=  generateTicketNumbers();
      printTicketNumbers(ticket);
          }
    public static int[] generateTicketNumbers(){
        int[] ticket = new int[LENGTH];
        Random random= new Random();
        for(int i= 0 ;i<ticket.length;i++){
            ticket[i]= random.nextInt(MAXLOTTARYNUMBER)+1;
        }
        return ticket;
    }
    public static void printTicketNumbers(int [] ticket){
       for (int number:ticket){
        System.out.print(number +" | ");
       }
    }
    }
