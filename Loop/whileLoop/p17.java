/* WAP to print and count all the factors of a 
number.
i/p: 28
o/p: 1 2 4 7 14 28
Total Factors are: 6 */


package whileLoop;

public class p17 {
    public static void main(String[] args){
        int n=28;
        int i=1;
        int count =0;
        while (i<=n) {
            if(n%i==0){
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("Total Count are : "+count);
    }
}
