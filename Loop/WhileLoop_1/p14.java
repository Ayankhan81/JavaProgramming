/*WAJP to print the sum of below series:

1/2+1/4+1/6+1/8... ... upto 100 */

package WhileLoop_1;

public class p14 {
    public static void main(String[] args) {
        double i=1;
        double sum=0;
        while (i<=100) {
            if(i%2==0){
             sum+=(1.0/i);
            }
            i++;

        }
        System.out.println(sum);
    }
}
