package alexlin7.nutc.unit9;

import java.util.*;
import static java.util.Comparator.*;

public class Sort4 {

	public static void main(String[] args) {
		var words = Arrays.asList(
				"B", "X", "A", "M", null, "F", "W", "O", null);
				words.sort(nullsFirst(reverseOrder()));
				System.out.println(words);
				
	}

}