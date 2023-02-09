package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner in = new Scanner (System.in);
	System.out.println ("Pick a number n: ");
	int n = in.nextInt();
	
	boolean[ ] sieve = new boolean [n + 1];
	
	 for (int i = 0; i < sieve.length; i=i+1) {
     	
     	
     	sieve [i] = true; //this way, its actually going through each value in the array, setting all values in array to true
	 }
	for (int j = 2; j < sieve.length; j++) {
		if (sieve [j])
		{
			System.out.println(j);
		}
		//System.out.println (sieve[1]);
		for (int multiple = j*2; multiple<sieve.length; multiple+=j) {
			sieve [multiple] = false;
		}
	}
	}

}
