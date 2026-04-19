/* WAJP to print the sum of below series:

1*2²+2*3²+3*4² ... ... upto 100 */

package WhileLoop_1;

public class p11 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
         while (i<=100) {
            sum=sum+(i*((i+1)*(i+1)));
            i++;
         }
         System.out.println(sum);
    }
}
