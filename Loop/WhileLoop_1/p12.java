/*WAJP to print the sum of below series:
1²*2+2²*3+3²*4 ... ... upto 100  */

package WhileLoop_1;

public class p12 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;

        while (i<=100) {
            sum=sum+((i*i)*(i+1));
            i++;
        }
        System.out.println(sum);
    }
}
