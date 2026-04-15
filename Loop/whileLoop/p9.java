// WAP to print all the even numbers from 1 to 100
package whileLoop;

public class p9 {
    public static void main(String[] args){
        int i=1;
        while (i<=100) {
            if(i%2==0){
                System.out.println("Even Number is :" +i);
            }
            i++;
        }
    }
    
}
