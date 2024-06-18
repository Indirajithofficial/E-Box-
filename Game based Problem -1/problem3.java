import java.util.*;
class Main  {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[]  arr= new int[n];

		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		int x = sc.nextInt();
		int y = sc.nextInt();

		if(x > y) {
            System.out.println(n);
        }

        int count =0;

        for(int i =0;i<n;i++){
			if(arr[i]<=x) count++;
		}

        if(count%2 == 0){
            System.out.println(count/2);
        }
        else {
            System.out.println(count/2 + 1);
        }

		
		
		
	}
}
