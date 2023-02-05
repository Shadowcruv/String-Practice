import java.util.*;
public class Lenovo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        String name, fullname;
        System.out.println("Enter the two numbers ");
        num1 = scanner.nextInt() ;
        num2 = scanner.nextInt();
        System.out.println("num1 = " + num1 + "\t" + "num2 = " + num2);
        System.out.println("your name");
        name = scanner.next();
        fullname = scanner.next();
        System.out.println("name: " + name + "\t" + "fullname = " + fullname
        );
    }
}
