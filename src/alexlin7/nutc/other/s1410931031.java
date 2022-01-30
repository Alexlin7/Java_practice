package alexlin7.nutc.other;

import java.util.Scanner;

public class s1410931031 {

	public static void main(String[] args) {
		
		var console = new Scanner(System.in);
		int random = 0;
		int temp = 0;
		int innum = 0;
		int[] lottery = new int[49];
		int[] guess = new int[7];
		int total = 0;
		for(int i = 0; i < lottery.length; i++) {
			lottery[i] = i+1;
		}
				
		for(int i = 0; i < guess.length; i++) {
			System.out.printf("�п�J��%d�y���ƭ�(1-49)",i+1);
		    innum = console.nextInt();
		    if(innum < 1 || innum > 49) {
		    	i--;
		    	System.out.println("�z�ҿ�J���Ȥj��49�Τp��1�A�Э��s��J");
		    }
		    else {
		    	guess[i] = innum;
		    	System.out.println("��J" + innum);
		    }
		    
		    
		}
		
		System.out.println("�A�Ҳq���Ʀr:");
		for(var i : guess) {
			System.out.print(i + " ");
		}
		System.out.println();
	    
		
		for(int time = 0; time < 5; time++) {
			for(int j = 0; j < guess.length; j++) {
				random = (int) (Math.random() * 49);
				temp = lottery[j];
				lottery[j] = lottery[random];
				lottery[random] = temp;
			}
			
			System.out.println("�}�����X:");
			for(int i = 0; i < 7; i++ ) {
				System.out.print(lottery[i] + " ");
			}
			total=0;
			for(int i = 0 ; i < guess.length; i++) {
				for(int j = 0; j < guess.length ; i++) {
					if(lottery[i] == guess[j]) {
						total++;
						break;
					}
				}
			}
			System.out.println("��" + (time+1) + "���`�@��" + total +"�Ӹ�");
		}
		console.close();
		
	}

}