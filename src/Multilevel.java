class Shapeee{
    public void area(){
        System.out.println("Diplays Area");

    }
}
class Triangleee extends Shapee {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }

    class Equilateraltriangle extends Triangleee {
        public void area(int l, int h) {
            System.out.println(1 / 2 * l * h);


        }


        public class Multilevel {
             public static void main(String args[]){
                 System.out.println("");
             }
        }
    }
}