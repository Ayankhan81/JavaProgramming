/* WAJP to print the sum of below series:

1 ∗ 2 + 2 ∗ 3 + 3 ∗ 4 ... ... upto 100 */
package WhileLoop_1;

public class p10 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100) {
            sum=sum+(i*(i+1));
            i++;
        }
        System.out.println(sum);
    }
}
