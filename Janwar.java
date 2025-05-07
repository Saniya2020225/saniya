class Dog{
    void bark(){
        System.out.println("puppy is also barking");
    }
}
class Puppy extends Dog{
    void bark(){
        System.out.println("dog is barking");
        super.bark();
    }
}
public class Janwar {
    public static void main(String[] args) {
        Dog obj=   new Puppy();
        obj.bark();
    }
    
}
