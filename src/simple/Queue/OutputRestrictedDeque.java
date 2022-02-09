package simple.Queue;

import java.util.Scanner;

class Deque_Output extends Queue {
	public Deque_Output() {
		super();
	}
	
	public boolean isDequeEmpty() {
		return isQueueEmpty();
	}
	
	public void endeque_front(int d) {
		Node new_node = new Node(d);
		if(isQueueEmpty()) {
			rear = new_node;
		} else {
			new_node.next = front;
		}
		front = new_node;
	}
	
	public void endque_rear(int d) {
		enqueue(d);
	}
	
	public int dedque() {
		return dequeue();
	}
}

public class OutputRestrictedDeque {

	public static void main(String[] args) {
		
		Deque_Output dq = new Deque_Output();
		int[] input = {1, 2, 3, 4, 5, 6};
		int select;
		Scanner keyin = new Scanner(System.in);
		System.out.println("輸出限制性雙佇列處理......");
		for(int i = 0; i < 6; i++) {
			System.out.print("1 從尾存入 / 2 從前存入 ==> ");
			System.out.flush();
			select = keyin.nextInt();
			switch (select) {
				case 1 :
					dq.endque_rear(input[i]);
					break;
				case 2:
					dq.endeque_front(input[i]);
					break;
			}
		}
		
		System.out.print("存入的雙佇列順序: ");
		for(int i = 0; i < 6; i++) {
			System.out.print("[" + input[i] + "]");
		}
		System.out.print("\n 取出的雙佇列順序: ");
		while(!dq.isDequeEmpty()) {
			System.out.print("[" + dq.dedque() + "]");
		}
		System.out.println();
		keyin.close();
		
		

	}

}
