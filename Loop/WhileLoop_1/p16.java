/*WAJP to print the sum of below series:
1/1²+1/2²+1/3²+1/4²... ... upto 100 */

package WhileLoop_1;

public class p16 {
    public static void main(String[] args) {
        double i=1;
        double sum=0;
        while (i<=100) {
            sum+=(1.0/(i*i));
            i++;
        }
        System.out.println(sum);
    }
}
