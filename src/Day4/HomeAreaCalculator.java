package Day4;

public class HomeAreaCalculator {
    static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        System.out.println(room1.getCounter());
        room1.setLength(20);
        room1.setWidth(10);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("the area of room1 is "+areaOfRoom1);

    Rectangle room2  = new Rectangle(30,15);
    //room2.setLength(20);
   // room2.setWidth(4);
    double areaOfRoom2 = room2.calculateArea();
        System.out.println("the area of room2 is "+areaOfRoom2);
        System.out.println(" the total area is"+(areaOfRoom1+areaOfRoom2));

}}
