/*  WAJP to print sum of all even numbers from 1 to 100.

2+4+6+8+.........upto 100 */

package WhileLoop_1;

public class p2 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100) {
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("the total sum of even number is :"+sum);
    }
}
