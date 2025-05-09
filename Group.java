class Student{
    private String name;
    void setName(String name){
        this.name=name;
    }
    void getName(){
       System.out.println(name);
    }
}
public class Group {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setName("saniya");      
        obj.getName();
        System.out.println(obj.getName());
    }
}