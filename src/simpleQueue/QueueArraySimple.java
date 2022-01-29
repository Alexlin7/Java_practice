package simpleQueue;

import java.util.*;

class Queue_Array implements QueueInterface {
	private int[] queue;
	private int front;
	private int rear;
	
	public Queue_Array(int size) {
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	@Override
	public boolean isQueueEmpty() {
		if(front == rear) return true;
		return false;
	}
	
	@Override
	public boolean enqueue(int d) {
		if(rear >= queue.length) return false;
		
		queue[++rear] = d;
		return true;
	}
	
	@Override
	public int dequeue() {
		if(isQueueEmpty()) return -1;
		
		return queue[++front];
	}
	
}

public class QueueArraySimple {
	public static void main(String args[]) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		Scanner keyin = new Scanner(System.in);
		
		int input = 0;
		while(true) {
			input = keyin.nextInt();
			if(input == -1) break;
			data.add(input);
		}
		keyin.close();
		
		Queue_Array q = new Queue_Array(data.size());
		
		System.out.print("存入佇列資料的順序: ");
		for(int i = 0; i < data.size() ; i++) {
			q.enqueue(data.get(i));
			System.out.print("[" + data.get(i) +"]");
		}
		System.out.print("\n取出佇列資料的順序: ");
		
		while ( !q.isQueueEmpty()) {
			System.out.print("[" + q.dequeue() + "]");
		}
		System.out.println();
	}

}
