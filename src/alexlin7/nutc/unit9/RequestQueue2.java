package alexlin7.nutc.unit9;

import java.util.*;

interface Request2 {
	void execute();
}

public class RequestQueue2 {

	public static void main(String[] args) {
		var request = new LinkedList<Request2>();
		offerRequestTo(request);
		process(request);
		
	}
	
	public static void offerRequestTo(Queue<Request2> requests) {
		//模擬加入佇列
		for(var i = 1; i < 6 ; i++) {
			requests.offer(
					() -> System.out.printf("處理資料 %f%n", Math.random())
			);
		}
	}
	
	public static void process(Queue<Request2> requests) {
		while(requests.peek() != null) {
			var request = requests.poll();
			request.execute();
		}
	}
	
	

}
