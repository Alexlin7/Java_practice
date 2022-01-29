package unit9.alexlin7.nutc;

import java.util.*;

public class ForEach {

	public static void main(String[] args) {
		var names = Arrays.asList("Justin", "Monica", "Irene");
		names.forEach(name -> System.out.println(name));
		new HashSet(names).forEach(name -> System.out.println(name));
		new ArrayDeque(names).forEach(name -> System.out.println(name));
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
