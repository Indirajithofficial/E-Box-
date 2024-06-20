import java.util.*;
public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();

         double ans = ((n2-n1)*100)/n1;

         System.out.println(String.format("%2f",ans));


    }


    
}
