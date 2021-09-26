import java.util.Scanner;
public class fibo{
    static Scanner sc = new Scanner(System.in);
    static int prev  = 0, next = 1, ans =0;
    public static void recur(int count){
        System.out.print(prev+" ");
        ans = prev + next ;
        prev = next ;
        next = ans ;
        if(count >1){
            recur(count -1);

        }
    }
    public static void main(String args[]){
        System.out.println("Enter how many numbers to be printed : ");
        int count = sc.nextInt();
        recur(count);
    }
}