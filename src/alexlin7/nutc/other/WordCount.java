package alexlin7.nutc.other;

import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("請輸入英文");
		var words = tokenSet(console.nextLine());
		System.out.printf("不重複單字有 %d 個 : %s%n", words.size(), words);
		
		console.close();
	}

	static Set<String> tokenSet(String line) {
		var tokens = line.split(" ");
		return new HashSet<String>(Arrays.asList(tokens));
	}

}
