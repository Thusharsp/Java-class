public class DogApp {
    public static void main(String arg[])
    {
        Dog d1 = new Dog();
        d1.name = "Tony";
        d1.breed = "Lab";
        Dog d2 = new Dog();
        d2.name = "Trex";
        d2.breed = "Pug";

        System.out.println("Dog 1 Name :"+ d1.name);
        System.out.println("Dog 1 breed :" + d1.breed);
        d1.bark();

        System.out.println("Dog 2 Name :"+ d2.name);
        System.out.println("Dog 2 breed :" + d2.breed);
        d2.bark();

        
    }
    
}

class Dog{

    String name;
    String breed;
    void bark(){
        System.out.println("Bow Bow");
    }

}
