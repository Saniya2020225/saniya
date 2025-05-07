public class animal {
    void eat(){
        System.out.println("eatinggg");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barkk");
    }
}
class puppy extends animal{
    void lazy(){
        System.out.println("cutieee");
    }

    public static void main(String[] args) {
        dog obj=new dog();
        puppy obj1=new puppy();
        obj.eat();
        obj.bark();
        obj1.eat();
        obj1.lazy();
    }
}