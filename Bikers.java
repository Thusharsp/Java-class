public class Bikers {
    public static void main(String[] arg)
    {
        Rider r1 = new Rider("Trex","fz",200000);
        Rider r2 = new Rider("Appi","Pulsar",180000);
        System.out.println("Name :"+r1.name);
        System.out.println("BikerName :"+r1.bikename);
        System.out.println("Price :"+r1.price);

        System.out.println("Name :"+r2.name);
        System.out.println("BikerName :"+r2.bikename);
        System.out.println("Price :"+r2.price);



    }
    
}

class Rider
{
    String name;
    String bikename;
    int price;
    void ride()
    {
        System.out.println("We ride room room!!");
    }

    Rider(String name, String bikename, int price)
    {
        this.name=name;
        this.bikename=bikename;
        this.price=price;

    }
}
