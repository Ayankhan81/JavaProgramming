/*WAJP to print sum of all Odd numbersfrom 1 to 100.

1+3+5+7+.........upto 100 */

package WhileLoop_1;

public class p3 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100) {
            if (i%2==1) {
                sum+=i;
            }
            i++;
        }
        System.out.println("the sum of all odd num is :"+sum);
    }
}
