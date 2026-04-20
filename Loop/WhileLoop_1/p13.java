/* WAJP to print the sum of below series:

1/1+1/2+1/3+1/4... ... upto 100
 */
package WhileLoop_1;

public class p13 {
    public static void main(String[] args) {
        double i = 1;
        double sum = 0;
        while (i <= 100) {
            sum=sum+(1.0/i);
            i++;
        }
        System.out.println(sum);
    }
}
