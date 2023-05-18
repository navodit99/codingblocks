package codingblocks;

import java.util.*;
import java.lang.Math.*;
public class quadraticequations {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int discriminant= b*b-4*a*c;
		if (discriminant>0) {
			int root1=(int) ((-b+Math.sqrt(discriminant))/(2*a));
			int root2=(int) ((-b-Math.sqrt(discriminant))/(2*a));
			System.out.println("Real and Distinct");
			System.out.println(Math.min(root1,root2)+" "+Math.max(root1,root2));

		}
		else if(discriminant==0) {
			int root=(int) (-b/(2*a));
			System.out.println("Real and Equal");
			System.out.println(root+" "+root);

		}
		else {
			System.out.println("Imaginary");
		}

    }
}
