package Day4;

import java.util.Scanner;

public class HomeAreaCalclatorRedo {
    Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        HomeAreaCalclatorRedo home = new HomeAreaCalclatorRedo();
        Rectangle kitchen = home.getRomDimentions();
        Rectangle bathroom = home.getRomDimentions();
        home.scanner.close();
        double totalArea = home.calculateTotalArea(kitchen, bathroom);
        System.out.println("the total Area is " + totalArea);
    }
    Rectangle getRomDimentions() {
        System.out.println("please Enter Room length");
        double length= scanner.nextDouble();
        System.out.println("please Enter Room width");
        double width= scanner.nextDouble();

return new Rectangle(length,width);
    }
    double calculateTotalArea(Rectangle room1,Rectangle room2){
        return room1.calculateArea()+room2.calculateArea();
    }
}