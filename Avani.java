public class Avani {
    int age=15;
    void paper(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        Avani obj=new Avani();
        obj.paper();
        System.out.println(obj.age);
    }
}