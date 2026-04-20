/* WAJP to accept a input from user and
print factorial of that number.
i/p: 6
o/p: 6!= 720 */
package WhileLoop_1;

public class p19 {
    public static void main(String[] args) {
        long i=1;
        int n=6;
        int fact=1;
        while (i<=n) {
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
}
