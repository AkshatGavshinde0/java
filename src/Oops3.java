// inheritance= ek generation se dusri generatiomn tk pass krna ;
 // in java inheritance meanns jb ek class ki property jb koi dusri class lena chati hai is process ko inheritane bolte hai

class Shape{      // parent class = jis class ki property li jati hai.

    String color;

}

class Triangle extends Shape{      // subclass = jo class properties leti hai .

}
public class Oops3 {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color="red";
    }

    }

