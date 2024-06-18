import java.util.*;
public class problem4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
		int[]  arr= new int[n];


		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
		}
        int xor = arr[0];
        for(int i=1;i<n;i++){
			xor ^= arr[i];
		}

        if(xor ==0){
            System.out.println("Alice");
            return;
        }
        else{
            if(n%2 == 1){
            System.out.println("Bob");
            return;
            }
            else{
                System.out.println("Alice");
                return;
                }
        }



    }
    
}
