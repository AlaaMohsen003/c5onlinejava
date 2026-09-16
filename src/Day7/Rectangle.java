package Day7;

public class Rectangle extends Shape{
    private double length;
    private double width;
    @Override
    public double calculateArea() {
        return length*width;
    }

    public Rectangle(double length,double width) {
        this.length =length;
        this.width=width;
    }
}
