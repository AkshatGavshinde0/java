import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();

        //add method in array list

        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // get method
        int element=list.get(2);
        System.out.println(element);

        // to add element in between

        list.add(0,1);
        System.out.println(list);

        // set element
        list.set(0,6);
        System.out.println(list);

        // delete element
        list.remove(0);
        System.out.println(list);

        // size of arraylit
        int size=list.size();
        System.out.println(size);

        //loop
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));

        // sorting
            Collections.sort(list);


        }
    }
}
