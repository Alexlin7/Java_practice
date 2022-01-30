package alexlin7.nutc.other;

public class sBigLotto {

	public static void main(String[] args) {
		int[] lotto = new int[7];
		int start = 1;
		int end = 49;
		int nums = 7;
		sBigLotto c1 = new sBigLotto();
		
		getRndSatic(lotto, start, end, nums);
		c1.getRnd(lotto, start, end, nums);

	}
	
	public static void getRndSatic(int[] args, int start, int end, int nums) {
		int[] rand = new int[49];
		int indexR;
		int temp;
		for(int i = 0;i < rand.length; i++) {
			rand[i] = i + 1;
		}
		for(int i = 0;i < rand.length; i++) {
			indexR = (int)(Math.random()*49);
			temp = rand[i];
			rand[i] = rand[indexR];
			rand[indexR] = temp;
		}
		System.out.println("本期期大樂透開奬號碼如下:");
		for(int i = 0;i < (args.length - 1); i++) {
			System.out.print( rand[i] + " ");
		}
		System.out.println();
		System.out.println("特別號: " + rand[7]);
	}
	
	public void getRnd(int[] args, int start, int end, int nums) {
		int[] rand = new int[49];
		int indexR;
		int temp;
		for(int i = 0;i < rand.length; i++) {
			rand[i] = i + 1;
		}
		for(int i = 0;i < rand.length; i++) {
			indexR = (int)(Math.random()*49);
			temp = rand[i];
			rand[i] = rand[indexR];
			rand[indexR] = temp;
		}
		System.out.println("本期期大樂透開奬號碼如下:");
		for(int i = 0;i < (args.length - 1); i++) {
			System.out.print( rand[i] + " ");
		}
		System.out.println();
		System.out.println("特別號: " + rand[7]);
	}

}
