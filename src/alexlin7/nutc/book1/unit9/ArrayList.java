package alexlin7.nutc.book1.unit9;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayList<E>{
	private Object[] elems;
	private int next;
	
	public ArrayList (int capacity) {
		elems = new Object[capacity];
	}
	
	public ArrayList() {
		this(16);
	}
	
	public void add(E e) {
		if(next ==elems.length) {
			elems = Arrays.copyOf(elems, elems.length * 2);
		}
		elems[next++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E get (int index) {
		return (E) elems[index];
	}
	
	public int size() {
		return next;
	}

	public void foreach(Consumer<? super E> action) {
		Objects.requireNonNull(action);
		for (int i = 0; i < this.size(); i++) {
			action.accept(this.get(i));
		}
	}

	public ArrayList<E> filter(Predicate<? super E> predicate) {
		var It = new ArrayList<E>();
		for(int i = 0;i < this.size(); i++) {
			var elem = get(i);
			if(predicate.test(elem)) {
				It.add(elem);
			}
		}
		return It;
	}

	public <R> ArrayList<R> map(Function<E, R> function) {
		var It = new ArrayList<R>();
		for (int i = 0; i < this.size(); i++) {
			It.add(function.apply(get(i)));
		}
		return It;
	}

	public Optional<E> reduce(BinaryOperator<E> operator) {
		var result = this.get(0);
		for(int i = 0; i < this.size(); i++) {
			operator.apply(result, get(i));
		}
		return Optional.ofNullable(result);
	}
}
