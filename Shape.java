class Aakar{
    void draw(){
        System.out.println("It has any shape");
    }
}
class circle extends Aakar{
    void draw(){
        System.out.println("this is circle");
        super.draw();
    }
}
class rectangle extends circle{
    void draw(){
        System.out.println("this is rectangle");
        super.draw();
    }
}
public class Shape {
    public static void main(String[] args) {
        Aakar obj= new circle();
        Aakar obj1= new rectangle();
        obj.draw();
        obj1.draw();
    }
}
