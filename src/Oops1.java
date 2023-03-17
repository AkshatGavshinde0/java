class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

}

public class Oops1 {
 public static void main(String args[]){
     Student s1=new Student();
     s1.name="Akshat";
     s1.age=19;

     s1.printinfo();


 }



}
