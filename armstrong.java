package codingblocks;
import java.util.*;
public class armstrong {


	    public static void main(String args[]) {
	        // Your Code Here
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			armstrong(n1,n2);
	    }
		public static void armstrong(int n1,int n2) {
			int num=n1;
			while(num<=n2) {
				int sum=0;
				int temp=num;
				while(temp>0) {
					int rem=temp%10;
					sum=sum+(rem*rem*rem);
					temp=temp/10;
				}
				if(sum==num){
					System.out.println(sum);
				}
				num++;
			}
		}
	
}
