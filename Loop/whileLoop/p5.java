// WAP to print and count all the numbers from 1 to 100 which are perfect square.

package whileLoop;

public class p5 {
    public static void main(String[] args){
        int count=0;
        int i=1;
        while(i*i<=100){
           System.out.println("Perfect Square :"+i*i);
           i++;
           count++;

        }
        System.out.println("Total perfect Square is"+count);

    }
}
