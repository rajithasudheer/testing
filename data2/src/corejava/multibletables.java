package corejava;

import java.util.Scanner;

public class multibletables {

	public static void main(String[] args) {
		int n,t;
		System.out.println("enter as intiger to print table =");
		
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		System.out.println("enter an integer to print table;");
		for(t = 1;t<=10;t++){//2*2=4 2*3=6
			System.out.println(n + "*"+ t+"="+(n*t));
			
		}
	}
	}


