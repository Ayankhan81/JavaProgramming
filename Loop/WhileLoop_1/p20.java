/* WAJP to accept two numbers from user
and print power of a to b.
i/p: 6 3
o/p: 6 to power 3 is: 216 */
package WhileLoop_1;
import java.util.*;
public class p20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b :");
        int b=sc.nextInt();
        int i=1;
        int result=1;
        while (i<=b) {
            result*=a;
            i++;
        }
        System.out.print(result);

        // int result=(int)Math.pow(a, b);
        // System.out.println(result);
    }
}
