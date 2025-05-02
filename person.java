public class person {
    String firstname="avani";
    int age=16;
    person(){
        System.out.println("hello");
    }
    person(String firstname){
        this();
        System.out.println(firstname);
    }
    person(String firstname,int age){
        this(firstname);
   this.firstname=firstname;
    age=age;
    

   System.out.println(firstname+  "  "+age);}}
    class main{
        public static void main(String[] args) {
            person obj=new person("saniya",18);
           // person obj1=new person("anjali", 19);
            System.out.println(obj.firstname);
          //  System.out.println(obj1.firstname);
        }
    }

