package sem1;
import java.util.*;
public class delhioddeven {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++){
			int CarNo = sc.nextInt();
			int rem = 0;
			int sumodd = 0;
			int sumeven=0;
			while(CarNo >0){
				rem = CarNo%10;
				if(rem%2 ==0){
					sumeven += rem;
				}else{
					sumodd+=rem;
				}
				CarNo= CarNo/10;
			}
			if(sumodd%3 ==0 || sumeven%4 == 0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
    }
}