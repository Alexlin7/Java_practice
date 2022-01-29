package alexlin7.nutc;

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		
		Scanner keyin = new Scanner(System.in);
		String[] input = new String[2];
		String[][] spiltString = new String[2][2];
		int[][] a = new int[2][2];
		int x, y, z, z2, z3;
		
		for(int i = 0; i < input.length; i++) {
			System.out.print("請輸入第" + (i + 1) + "個分數:");
			input[i] = keyin.nextLine();
		}
		keyin.close();
		
		for(int i = 0 ; i < input.length; i++) {
			spiltString[i] = input[i].split("/");
			a[i][0] = Integer.parseInt(spiltString[i][0]);
			a[i][1] = Integer.parseInt(spiltString[i][1]);
		}
		
		x = a[0][0] * a[1][1] + a[1][0]*a[0][1]; //通分
		y = a[0][1] * a[1][1]; 
		z = gcd(x, y);//輾轉相除法球最大公因數
		z2 = lcm(a[0][1], a[1][1]);
		z3 = y/z2;
		System.out.printf("%d/%d + %d/%d = %d/%d = %d/%d", 
				a[0][0], a[0][1], a[1][0], a[1][1], x/z3, y/z3, x/z, y/z);
		
	}
	
	private static int lcm(int m, int n){
        int m1 = m;
        int n1 = n;
        while(m % n != 0){
            int tmp = m % n;
            m = n;
            n = tmp;
        }
        return m1*n1 / n;
    }
	
	private static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
	
	
	




}
