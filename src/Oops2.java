import java.sql.SQLOutput;

class Student2 {
    String name;
    int age;

    public void printInfo(String name) {               // polymorphism
        System.out.println(name);
    }
        public void printInfo(int age){               // polymorphism
            System.out.println(age);
    }
      public void printInfo(String name, int age){        // polymorphism
          System.out.println(name+""+age);
      }

}
public class Oops2 {

    public static void main(String args[]){

Student2 s2=new Student2();
       s2.name="aman";
       s2.age=21;

       s2.printInfo(s2.name, s2.age);


    }


}
