/*
WAJP to print sum of cubes of all natural
numbers from 1 to 100.
*/

package WhileLoop_1;

public class p5 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100) {
            sum=sum+(i*i*i);
            i++;
        }
        System.out.println("Sum All Cubes :"+sum);
    }
}
