abstract  class Shapee {
    abstract void area(int a);
        void drawing(){
        System.out.println("this is any shape:");
        }
    }
    class Circle extends Shapee{
        void area(int a){
            System.out.println("this is circle area:"+a);
        }
    }
    class Rectangle extends Shapee{
        void area(int b){
            System.out.println("this is rectangle area:"+b);
        }
    }
    public class Calculate{
        public static void main(String[] args) {
            Shapee obj= new Circle();
            obj.area(16);
            obj.drawing();
            Shapee obj1= new Rectangle();
            obj1.area(15);
            obj1.drawing(); 
        }
    }
