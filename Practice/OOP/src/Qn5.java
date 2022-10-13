//Write a java program to create a class Camera with private properties [id, brand, color, price]. Create a getter and setter to get and set values. Also, create 3 objects of it and print all details.

public class Qn5 {
    public static void main(String[] args) {
        Camera c1 = new Camera();
        c1.setId(1);
        c1.setBrand("Canon");
        c1.setColor("Black");
        c1.setPrice(1000000);

        System.out.println(c1.getId());
        System.out.println(c1.getBrand());
        System.out.println(c1.getColor());
        System.out.println(c1.getPrice());


    }
}
class Camera{
    private int id;
    private String brand;
    private String color;
    private double price;

    int getId(){
        return id;
    }
    String getBrand(){
        return brand;
    }
    String getColor(){
        return color;
    }
    double getPrice(){
        return price;
    }

    void setId(int id){
        this.id= id;
    }

    void setBrand(String brand){
        this.brand =brand;
    }

    void setColor(String color){
        this.color=color;

    }

    void setPrice(double price){
        this.price = price;

    }
}
