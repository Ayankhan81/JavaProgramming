/* WAJP to print sum of squares of all even
numbers from 1 to 100.
 */

package WhileLoop_1;

public class p6 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100) {
            if(i%2==0){
                sum=sum+(i*i);
            }
            i++;
        }
        System.out.println("Sum of All square number:"+sum);
    }
}
