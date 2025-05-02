public class people {
        void displayName() {
        System.out.println("Name: Aryan");
        }
       }
       class Student extends people {
        void displayClass() {
        System.out.println("Class: 12th");
        }
       }
       class Monitor extends Student {
        void checkDiscipline() {
        System.out.println("Monitor is checking discipline");
        }
        public static void main(String[] args) {
            Monitor mon=new Monitor();
            mon.displayName();
            mon.displayClass();
            mon.checkDiscipline();
        }}
