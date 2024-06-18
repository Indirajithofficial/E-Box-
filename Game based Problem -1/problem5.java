import java.util.*;
public class problem5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
		int[]  arr= new int[n];

        int three = 0;
        int five = 0;
        int common = 0;

		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
            if(arr[i]%3 == 0){
                three++;
            }
            else if(arr[i]%5 ==0 ){
                five++;
            }
            else if(arr[i]%3 == 0 && arr[i]%5 ==0){
                common++;
            }
		}

        if(common%2 == 0){
            if(five >= three){
                System.out.println("B");
                return ;
            } 
            else{
                System.out.println("A");
                return;
            } 
        }
        else{
            int quotient = common/2 + 1;
            three += quotient;
            five += (common-quotient);

            if(five >= three){
                System.out.println("B");
                return ;
            } 
            else{
                System.out.println("A");
                return;
            } 

        }



    }
    
}
