package simple.Queue;

import java.util.Scanner;

class DequeInput extends CircularQueue {
	
	public DequeInput(int size) {
		super(size);
	}
	
	public boolean isDequeEmpty() {
		return isCQueueEmpty();
	}
	
	public boolean isDequeFull() {
		return isCQueueFull();
	}
	
	public boolean endque(int d) {
		return enqueue(d);
	}
	
	public int deque_front() {
		return dequeue();
	}
	
	public int dequeue_rear() {
		int temp = 0;
		if(isDequeEmpty()) return -1;
		
		temp = queue[rear];
		rear--;
		if(rear < 0 && front != -1)
			rear = queue.length - 1;
		return temp;
	}
	
}

public class DequeInputSimple {

	public static void main(String[] args) {
		DequeInput dq = new DequeInput(10);
		int[] input = {1, 2, 3, 4, 5, 6};
		int[] output = new int[6];
		int select = 0;
		int temp, pos = 0;
		
		for(int i = 0 ; i < 6 ; i++) {
			dq.endque(input[i]);
		}
		
		Scanner keyin = new Scanner(System.in);
		
		while( !dq.isDequeEmpty()) {
			System.out.print("1 從尾取出 / 2 從頭取出");
			System.out.flush();
			
			select = keyin.nextInt();
			switch (select) {
				case 1:
					temp = dq.dequeue_rear();
					output[pos++] = temp;
					break;
				case 2:
					temp = dq.deque_front();
					output[pos++] = temp;
					break;
			}
		}
		
		System.out.print("存入雙佇列順序: ");
		for(int i = 0; i < 6 ; i++) {
			System.out.print("[" + input[i] + "] ");
		}
		
		System.out.print("\n取出雙佇列順序: ");
		for(int i = 0 ; i < 6 ; i++) {
			System.out.print("[" + output[i] + "] ");
		}
		System.out.println();
		keyin.close();
		

	}

}
