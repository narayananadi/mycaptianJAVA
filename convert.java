import java.util.*;
public class convert{
    public void cvrtr(int tempdate){
        int years = tempdate/(60*24*365);
        int days = (tempdate % (60*24*365))/(60*24);
        System.out.println(tempdate + " minutes is approximately " + years + " years and "+days +" days");

    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        convert obj = new convert();
        obj.cvrtr(date);

    }
}