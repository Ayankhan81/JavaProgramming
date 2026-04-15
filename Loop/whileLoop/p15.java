/* WAP to print all the factors of a number.
i/p: 28
o/p: 1 2 4 7 14 28 */


package whileLoop;

public class p15 {
    public static void main(String[] args){
        int n=28;
        int i=1;
        while (i<=n) {
          if(n%i==0){
            System.out.println(i);
          }
          i++;
        }
    }
}
