
import java.util.Scanner;
public class Sbuffer {

    public static void main(String[] args) {


        StringBuffer str=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        str.append(sc.nextLine());

        // setCharAt(n,character)
        str.setCharAt(4,'p');
        System.out.println(str);

        // insert
        // str1 insert(n,str2)
        str.insert(3,"ABCD");
        System.out.println(str);

        // set length()
        str.setLength(20);
        System.out.println(str);



    }
}


