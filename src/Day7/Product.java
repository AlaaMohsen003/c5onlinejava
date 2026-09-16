package Day7;

public interface  Product {
    String logo ="logo";
    void setName(String name);
    void setColor(String color);
    void setPrice(double Price);
    String getName();
    String getColor();
    double getPrice();
    default String getBarcode(){
        return "defult barcode";
    }
}
