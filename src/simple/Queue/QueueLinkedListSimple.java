package simple.Queue;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

class Queue_LinkedList implements QueueInterface {
	private Node front;
	private Node rear;

	public Queue_LinkedList() {
		front = null;
		rear = null;
	}

	@Override
	public boolean enqueue(int d) {
		Node new_node = new Node(d);
		if (rear == null) {
			front = new_node;
		} else {
			rear.next = new_node;
		}
		rear = new_node;
		return true;

	}

	@Override
	public int dequeue() {
		int d;
		if (!isQueueEmpty()) {
			if (front == rear)
				rear = null;

			d = front.data;
			front = front.next;
			return d;

		}
		return -1;
	}

	@Override
	public boolean isQueueEmpty() {
		return front == null;

	}

}

public class QueueLinkedListSimple {

	public static void main(String[] args) {
		Queue_LinkedList q = new Queue_LinkedList();
		int[] input = new int[100];
		int[] output = new int[100];
		int select = 1;
		int numOfInput = 0;
		int numOfOutput = 0;
		int temp = -1;

		Scanner keyin = new Scanner(System.in);
		System.out.println("鏈結串列的佇列處理......");

		while (select != 3) {
			System.out.print("1 存入 / 2 取出");
			System.out.print("/ 3 顯示全部內容");
			System.out.flush();

			select = keyin.nextInt();
			switch (select) {
				case 1:
					System.out.print("請輸入存入值(" + numOfInput + ")");
					System.out.flush();
					temp = keyin.nextInt();
					q.enqueue(temp);
					input[numOfInput++] = temp;
					break;
				case 2:
					if (!q.isQueueEmpty())
						temp = q.dequeue();
					System.out.println("取出元素:" + temp);
					output[numOfOutput++] = temp;
					break;
			}
		}
		
		System.out.print("輸入佇列的元素: ");
		for (int i = 0; i < numOfInput; i++) {
			System.out.print("[" + input[i] + "]");
		}
		System.out.print("\n 取出佇列的元素: ");
		for (int i = 0; i < numOfOutput; i++) {
			System.out.print("[" + output[i] + "]");
		}
		System.out.print("\n 佇列剩下的元素: ");
		while (!q.isQueueEmpty()) {
			System.out.print("[" + q.dequeue() + "]");
		}
		System.out.println();
		keyin.close();

	}

}
