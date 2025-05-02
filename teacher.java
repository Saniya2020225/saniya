public class teacher {
        String firstname="avani";
        int age=16;
        teacher(){
            System.out.println("hello");
        }
        teacher(String firstname,int age){
       this. firstname=firstname;
        age=age;
        
    
                System.out.println(firstname+  "  "+age);}}
        class main{
            public static void main(String[] args) {
                teacher obj=new teacher("kittu",20);
               // person obj1=new person("anjali", 19);
                System.out.println(obj.firstname);
              //  System.out.println(obj1.firstname);
            }
        }
    
    

