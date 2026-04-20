
/*WAJP to print the sum of below series:

1/1+1/3+1/5+1/7... ... upto 100 */
package WhileLoop_1;

public class p15 {
    public static void main(String[] args) {
        double i=1;
        double sum=0;

        while (i<=100) {
            if(i%2==1){
                sum+=(1.0/i);

            }
            i++;
        }
        System.out.println(sum);
    }
}
