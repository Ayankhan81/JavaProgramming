/* WAP to count the factors of a number.
i/p: 28
o/p: Total Factors are: 6
*/


package whileLoop;

public class p16 {
    public static void main(String[] args){
        int n=28;
        int i=1;
        int count=0;
        while (i<=n) {
            if(n%i==0){
                count++;
            }
            i++;
        }
        System.out.println("Total factor are :"+count);
    }
}
