package Day5;

public class Month {
   public static String getMonth(int monthNumber){
        switch (monthNumber){
            case 1 : return "jan";
            case 2: return "feb";
            case 3 : return "march";
            case 4 : return "Apr";
            case 5: return "may";
            case 6: return "june";
            case 7 : return "july";
            case 8 : return "Aug";
            case 9: return "Seb";
            case 10 : return "oct";
            case 11 : return "nov";
            case 12 : return "december";
            default: return "invalid Day Number";



        }
    }
    public static int  getMonth(String monthName){
       switch (monthName){
           case "jan" : return 1;
           case "feb": return 2;
           case "mar" : return 3;
           case "apr": return 4;
           case "may": return 5;
           case "jun": return 6;
           case "jul" : return 7;
           case "Aug" : return 8;
           case "seb": return 9;
           case "oct": return 10;
           case"Nov" : return 11;
           case "ec" : return 12;
           default: return -1;


       }
    }
}
