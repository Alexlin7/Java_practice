package alexlin7.nutc;

import java.util.*;

interface Request {
	void execute();
}

public class RequestQueue {

	public static void main(String[] args) {
		var requests = new LinkedList<Object>();
		offerRequestTo(requests);
		process(requests);

	}
	
	static void offerRequestTo(Queue<Object> requests) {
		for(int i = 1 ; i < 6 ; i++) {
//			Request request = new Request() {
//				public void execute() {
//					System.out.printf("處理資料 %f%n", Math.random());
//				}
//			};
			Request request = () -> System.out.printf("處理資料 %f%n", Math.random());
			requests.offer(request);
		}
	}
	
	static void process(Queue<Object> requests) {
		while(requests.peek() != null) {
			var request = (Request) requests.poll();
			request.execute();
		}
	}

}
