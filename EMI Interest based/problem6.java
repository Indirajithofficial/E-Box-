import java.util.*;
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        double r = sc.nextDouble();
        int year = sc.nextInt();

        double si = (P*r*year)/100;
        double pow = Math.pow(1+(r/100),year);
        double ci = P*pow;
        ci = ci-P;

        System.out.println(Math.round(si));
        System.out.println(Math.round(ci));



    }


    
}
