package Day5;

public record MonthConverter() {
    static void main(String[] args) {
        System.out.println(Month.getMonth("feb"));
        System.out.println(Month.getMonth(1));
    }
}
