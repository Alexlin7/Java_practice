package alexlin7.nutc.other;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入一個整數：");
		int i = keyin.nextInt();
		keyin.close();
		if(isPrime(i)) {
			System.out.println(i + "是質數");
		} else {
			System.out.println(i + "不是質數");
		}
		
	}
	
	static boolean isPrime(int i) {
		int count = 0;
		if(i < 2) return false;
		if(i == 2) return true;
		
		for(int j = 1; j <= (i/2); j++) { 
			if(i % j == 0) count++;
			if(count>1) return false; 
		}
		return true;
		
	}

}
