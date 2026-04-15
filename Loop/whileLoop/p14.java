// WAP to print and count all the numbers from 1 to 1000  which are divisible by 7 and also ends with 7

package whileLoop;

public class p14 {
    public static void main(String[] args){
        int i=1;
        int count=0;
        while (i<=1000) {
            if(i%7==0 & i%10==7){
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("Count is :"+count);
    }
}
