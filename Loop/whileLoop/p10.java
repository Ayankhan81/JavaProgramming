// WAP to print all the odd numbers from 1 to 100
package whileLoop;

public class p10 {
    public static void main(String[] args){
        int i=1;
        while (i<=100) {
            if(i%2==1){
                System.out.println("Odd Number :"+i);
            }
            i++;
        }
    }
}
