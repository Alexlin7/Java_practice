package alexlin7.nutc.other;

import java.util.*;

public class Stack {
	private Deque<String> elems = new ArrayDeque<>();
	private int capacity;
	
	public Stack(int capacity) {
		this.capacity = capacity;
	}
	
	public boolean push (String elem) {
		if(isFull()) return false;
		return elems.offerLast(elem);
	}
	
	private boolean isFull() {
		return elems.size() + 1 > capacity;
	}
	
	public Object pop() {
		return elems.pollLast();
	}
	
	public Object peek() {
		return elems.peekLast();
	}
	
	public int size() {
		return elems.size();	
	}
	
	public static void main(String[] args) {
		var stack = new Stack(5);
		Scanner console = new Scanner(System.in);
		System.out.println("請輸入姓名:");
		while(true) {
			var name = console.nextLine();	
			if(name.equals("quit")) break;
			stack.push(name);
		}
		for(int i = 0 ; i < 5; i++) {
			System.out.println(stack.pop());
		}
		console.close();

	}

}
