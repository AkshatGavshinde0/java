class Ink {
    String color;
    String type;

    public void write (){

        System.out.println("writing something");
    }
        public void printcolor() {
            System.out.println(this.color);
    }



        }


public class Oops {
    public static void main(String args []) {

 Ink Ink1= new Ink();
     Ink1.color="Blue";
     Ink1.type="Gel";

     Ink Ink2= new Ink();
     Ink2.color="Black";
     Ink2.type="Ball";

     Ink1.printcolor();
     Ink2.printcolor();




    }
}


