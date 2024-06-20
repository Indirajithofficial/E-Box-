import java.util.*;
public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int P = sc.nextInt();
         int n = sc.nextInt();
         double r = sc.nextDouble();

         double ans = P* ( (n*(n+1)) / (2*12)) *(r/100);

         System.out.println((int)ans);

         

    }


    
}
