package alexlin7.nutc.book1.unit18.sort;

public class SortDemo {
    public static void main(String[] args) {
        String[] strings = {"3", "2", "5", "1"};
        for (var s: Sort.sorted(strings)) {
            System.out.println(s);
        }
    }
}
