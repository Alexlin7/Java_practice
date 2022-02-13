package alexlin7.nutc.book1.unit9;

import java.util.*;

public class ForEach {

	public static void main(String[] args) {
		var names = Arrays.asList("Justin", "Monica", "Irene");
		names.forEach(System.out::println);
//		new HashSet<String>(names).forEach(System.out::println);
//		new ArrayDeque<String>(names).forEach(System.out::println);
//		forEach(names);
//		forEach(new HashSet(names));
//		forEach(new ArrayDeque(names));

	}
	
//	static void forEach(Iterable iterable) {
//		for(var obj : iterable) {
//			System.out.println(obj);
//		}
//	}

}
