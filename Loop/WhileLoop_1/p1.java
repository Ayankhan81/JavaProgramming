/* WAJP to print sum of all natural numbers from 1 to 100.

1+2+3+4+.........+100 */

package WhileLoop_1 ;

class p1{
    public static void main(String[] args){
        int i=1;
        int sum=0;

        while(i<=100){

            sum=sum+i;
            i++;
        }
            System.out.println("Sum is :"+sum);

    }
}