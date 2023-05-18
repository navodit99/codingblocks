package codingblocks;
import java.util.*;
public class fibonaccipattern {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			int nst=1;
			int n1=0;
			int n2=1;
			while(N>0 && N<100) {
			for(int row=0;row<=N-1;row++) {
				for(int col=1;col<=nst;col++) {
					System.out.print(n1+" ");
					 int n3 = n1 + n2;
				      n1 = n2;
				      n2 = n3;
				}
				System.out.println();
				nst++;
			}
			break;
			}
		}
	}

