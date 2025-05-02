public class employee {
    void work(){
        System.out.println("on work");
    }
}
class manager extends employee{
    void attendmeeting(){
        System.out.println("meeting");
    }
public static void main(String[] args) {
   manager obj=new manager(); 
   obj.work();
   obj.attendmeeting();
}
}
