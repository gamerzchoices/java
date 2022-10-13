//Write a java program to create a class House with properties [id, name, price]. Create a constructor of it and create 3 objects of it. Add them to the list and print all details.


public class Qn2 {

    public static void main(String[] args) {

        House h1 = new House(1,"Gupta House",30000000);
        House h2 =  new House(2,"Upahar Apartment",50000000);
        House h3 = new House(3,"JP House",10000000);

        House [] houseArray = {h1,h2,h3};
        for(House printDetails : houseArray){
            printDetails.hM();
        }
        
    }
}

class House{
    int id;
    String name;
    double price;


    House(int id,String name,double price){
        this.id =id;
        this.name =name;
        this.price=price;

    }

    void hM(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("price: "+this.price);
        System.out.println();
    }

}