package codingblocks;
import java.util.*;
public class checkprime {


	    public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			while(N>2 && N<=1000000000){
				if(N%2!=0) {
					System.out.println("Prime");
					break;
				}
				else {
					System.out.println("Not Prime");
					break;
				}

			}
	    }
	}
