/*WAJP to print sum of cubes of all even
numbers from 1 to 100.
 */

package WhileLoop_1;

public class p7 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100) {
            if(i%2==0){
                sum=sum+(i*i*i);
            }
            i++;
        }
        System.out.println("Sum of All Cubes of Even number is :" +sum);
    }
}
