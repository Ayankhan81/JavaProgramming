// WAP to print a number is a prime number or not

package whileLoop;

public class p18 {
    public static void main(String[] args) {
       int n=1;
       while (n<=10) {
        int i=1;
        int count=0;

            while (i<=n) {
                if(n%i==0){
                    count++;
                }
                i++;
            }
        if(count==2){
            System.out.println(n+" ");
        }
        n++;
       }
    }
}
