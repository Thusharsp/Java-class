public class CarApp {

    public static void main(String args[])
    {
        Car c = new Car();
        c.brand ="hyundai";
        c.color = "red";
        c.price = 120000;
        System.out.println("Brand :" + c.brand);
        System.out.println("Color :" + c.color);
        System.out.println("Price :" + c.price);
        c.accelerate();
    }
    
}

class Car{
    String brand;
    String color;
    int price;
    void accelerate(){
        System.out.println("The car accelerate");
    }
}

