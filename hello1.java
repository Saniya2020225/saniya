import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{
    int age;
    String name;
    int rollno;
    public Student(int age,String name,int rollno){
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }
    public String toString(){
    return age +"  "+ name +"   "+ rollno ;
    }
}
class SortByName implements Comparator<Student>{
     public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
}
}
class SortByAge implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.age-s2.age;
}
}
public class hello1{
    public static void main(String[] args) {
        ArrayList<Student>list = new ArrayList<>();
        list.add(new Student(14, "harry", 563));
         list.add(new Student(32, "mohit", 34));
        list.add(new Student(10, "om", 55));
        Collections.sort(list,new SortByName());
        for(Student s :list){
            System.out.println(s);
    }

 Collections.sort(list,new SortByAge());
        for(Student s2 :list){
            System.out.println(s2);
        }
    }
}