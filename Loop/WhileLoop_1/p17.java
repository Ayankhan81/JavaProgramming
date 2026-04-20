/*WAJP to print the sum of below series:
1/1³+1/2³+1/3³+1/4³ ... ... upto 100 */
package WhileLoop_1;

public class p17 {
    public static void main(String[] args) {
        double i=1;
        double sum=0;
        while (i<=100) {
            sum+=(1.0/(i*i*i));
            i++;
        }
        System.out.println(sum);
    }
}
