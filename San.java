class Vehicle{
    void run(){
        System.out.println("ye run karta hai");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("ye bhi chalti haiii");
        super.run();
    }
}
public class San {
    public static void main(String[] args) {
        Vehicle obj=  new Bike();
        obj.run();
    }
}

