package Day4;


public class Rectangle {
    private double length;
    private double width;
    private int counter;

  public Rectangle(){
      counter++;

      System.out.println("this default constructor ");
      length = 20;
      width=10;
  }
  public Rectangle(double length,double width){
      System.out.println("this is parameterized constructor ");
      this.length=length;
      setWidth(width);

  }
public void setCounter(int counter ){
      this.counter=counter;
}
    public void setLength(double length) {
        if (length > 0) {


            this.length = length;
        } else {
            this.length = 10;
        }
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getCounter() {
        return counter;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return length * 2 + width * 2;
    }
}
