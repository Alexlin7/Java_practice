package simple.Queue;

import java.util.Scanner;

public class QueueCircularSimple{

	public static void main(String[] args) {
		CircularQueue  cq = new CircularQueue (4);
		int[] input = new int[100];
		int[] output = new int[100];
		int select = 1;
		int numOfInput = 0;
		int numOfOutput = 0;
		int temp = 0;
		Scanner keyin = new Scanner(System.in);

		System.out.println("環狀佇列處理......");
		while (select != 3) {
			System.out.print("1 存入 2 取出 3 顯示全部:");
			System.out.flush();
			select = keyin.nextInt();

			switch (select) {
			case 1:
				System.out.print("請輸入存入值(" + numOfInput + ") : ");
				System.out.flush();
				temp = keyin.nextInt();
				cq.enqueue(temp);
				input[numOfInput++] = temp;
				break;
			case 2:
				if (!cq.isCQueueEmpty()) {
					temp = cq.dequeue();
					System.out.println("取出元素: " + temp);
					output[numOfOutput++] = temp;
				}
				break;
			}
		}
		keyin.close();
		
		System.out.print("輸入佇列的元素: ");
		for (int i = 0; i < numOfInput; i++) {
			System.out.print("[" + input[i] + "] ");
		}
		System.out.print("\n 取出佇列的元素: ");
		for (int i = 0; i < numOfOutput; i++) {
			System.out.print("[" + output[i] + "]");
		}

		System.out.print("\n 佇列剩下的元素");

		while (!cq.isCQueueEmpty()) {
			System.out.print("(" + cq.dequeue() + ")");
		}
		System.out.println();

	}

}

