// WAP to print all the numbers from 1 to 100  which are divisible by 7.
package whileLoop;

public class p11 {
    public static void main(String[] args){
        int i=1;
        while (i<=100) {
            if(i%7==0){
                System.out.println("Num Which is divisible by 7 :"+i);
            }
            i++;
        }
    }
}
