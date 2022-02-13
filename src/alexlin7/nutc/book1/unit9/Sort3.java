package alexlin7.nutc.book1.unit9;

import java.util.*;

//class SrtingComparator implements Comparator<String> {
//	@Override
//	public int compare(String s1, String s2) {
//		return -s1.compareTo(s2);
//	}
//}

public class Sort3 {

	public static void main(String[] args) {
		var words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
//		Collections.sort(words, new SrtingComparator());
		
//		if used lambda
		
//		ex1(Collections.sort):
//		Collections.sort(words, (s1, s2) -> -s1.compareTo(s2));
		
//		ex2(list.sort):
		words.sort((s1, s2) -> -s1.compareTo(s2));
		
		System.out.println(words);
	}

}
