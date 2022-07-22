package alexlin7.nutc.book1.unit18.sort;

import java.util.Arrays;

public class Sort {
    public static <T extends Comparable<T>> T[] sorted(T[] array) {
        T[] arr = Arrays.copyOf(array, array.length);
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void sort(Object[] arr, int left, int right) {
        if (left < right) {
            var q = partition(arr, left, right);
            sort(arr, left, q - 1);
            sort(arr, q + 1, right);
        }
    }

    private static int partition(Object[] arr, int left, int right) {
        var i = left - 1;
        for (var j = left; j < right; j++)
            if (((Comparable) arr[j]).compareTo(arr[right]) <= 0) {
                i++;
                swap(arr, i, j);
            }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(Object[] arr, int i, int j) {
        var t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
