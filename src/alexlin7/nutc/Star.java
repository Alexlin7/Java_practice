package alexlin7.nutc;

public class Star {
	public static void main(String[] args) {
		int i,j,n;
		for(i=0;i<=9;i++) {
			for(j=0;j<=9;j++) {
				n = 9-(Math.abs(i-4)*2);
				if(j < n) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  "+"  ");
				}
				
			}
			System.out.println();
		}

	}

}
