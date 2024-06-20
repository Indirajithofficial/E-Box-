import java.util.*;
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        int year = sc.nextInt();

        double loss = (P*X*year)/100;
        double gain = (P*Y*year)/100;
        double profit = gain-loss;

        System.out.println(profit/2);


    }


    
}
