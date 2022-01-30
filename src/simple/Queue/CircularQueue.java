package simple.Queue;

public class CircularQueue {
	protected int[] queue;
	protected int front;
	protected int rear;

	public CircularQueue(int size) {
		queue = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isCQueueEmpty() {
		if (front == rear) return true;
		
		return false;
	}

	public boolean isCQueueFull() {
		int pos;
		pos = (rear + 1) % queue.length; // 若rear+1為陣列長度 則證明空間是滿的
		if (front == pos) return true;
		
		return false;
	}

	public boolean enqueue(int d) {
		if (isCQueueFull()) return false;

		rear = (rear + 1) % queue.length;
		queue[rear] = d;
		return true;
	}

	public int dequeue() {
		if (isCQueueEmpty()) return -1;

		front = (front + 1) % queue.length;
		return queue[front];
	}

}

