/*WAJP to print the sum of below series:

1/1*2+1/2*3+1/3*4+1/4*5 ... upto 100 */

package WhileLoop_1;

public class p18 {
    public static void main(String[] args) {
        double i=1;
        double sum=0;
        while (i<100) {
            sum+=(1.0/(i*(i+1)));
            i++;
        }
        System.out.println(sum);
    }
    }
