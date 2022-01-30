package alexlin7.nutc.other;

import java.util.*;

public class Guest {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		collectNameTo(names);
		printUpperCase(names);

	}

	static void collectNameTo(List<String> names) {
		Scanner console = new Scanner(System.in);
		while (true) {
			System.out.print("訪客姓名: ");
			var name = console.nextLine();
			if (name.equals("quit")) {
				console.close();
				break;
			}
			names.add(name);
		}
	}

	static void printUpperCase(List<String> names) {
		for (var i = 0; i < names.size(); i++) {
			var name = names.get(i);
			System.out.println(name.toUpperCase());
		}

	}

}
