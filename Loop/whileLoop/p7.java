// WAP to print all the numbers from 1 to 100 which are perfect cube

package whileLoop;

public class p7 {
    public static void main(String[] args){
        int i=1;
        while (i*i*i<=100) {
            System.out.println("Perfect cube under 100 :"+i*i*i);
            i++;
        }
    }
}
