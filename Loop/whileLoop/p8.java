// WAP to print and count all the numbers from 1 to 100 which are perfect cube.
package whileLoop;

public class p8 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i * i * i <= 100) {
            System.out.println(
                    i * i * i

            );
            i++;
            count++;
        }
        System.out.println("Total Perfect Cube :"+count);
    }
}
