import java.util.Scanner;
import java.lang.Math;
public class Prime{
    static Scanner sc = new Scanner(System.in);
    public static boolean cal(int num){
        boolean cond = true;
        int temp =(int) Math.sqrt(num);
        for(int i=0;i<temp;i++){
            if(num % temp == 0){
                cond = false;
                break;
            }
            else{
                cond = true;
            }
        }
        return cond;
    }

    public static void main(String args[]){
        System.out.println("Please insert any number");
        int num =  sc.nextInt();
        if(cal(num)){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is a composite number");
        }
    }
}