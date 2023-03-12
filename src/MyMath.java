import java.util.Scanner;

/**
 * @author crazyne55
 *
 * 3/12/2023 @ 1210
 */
public class MyMath {
    static Scanner s = new Scanner(System.in);
    public static int gcf(int a, int b) {
        int c;
        while (b!=0) {
            if(a>b) {
                c = b;
                b = a % b;
                a = c;
            }else {
                b = b % a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Enter 2 integer values to calculate the GCF");
        int a, b, c;
        System.out.print("1: ");
        a = Integer.parseInt(s.nextLine());
        System.out.print("2: ");
        b = Integer.parseInt(s.nextLine());
        c = gcf(a,b);
        System.out.printf("The GCF of %s and %s is %s%n",a,b,c);
    }
}
