package alexlin7.nutc.book1.unit11.arrayListSimple;

import java.util.Arrays;
import java.util.concurrent.locks.*;

public class ArrayList3<E> {
    private final StampedLock lock = new StampedLock();
    private Object[] elems;
    private int next = 0;

    public ArrayList3(int capacity) {
        elems = new Object[capacity];
    }

    public ArrayList3() {
        this(16);
    }

    public void add(E elem) {
        var stamp = lock.writeLock();
        try {
            if(next == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[next++] = elem;
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    public E get(int index) {
        var stamp = lock.tryOptimisticRead();
        var elem = elems[index];
        if(!lock.validate(stamp)) {
            try {
                elem = elems[index];
            } finally {
                lock.unlockRead(stamp);
            }
        }
        return (E) elem;
    }

    public int size() {
        var stamp = lock.tryOptimisticRead();
        int size = next;
        if(!lock.validate(stamp)) {
            try {
                size = next;
            } finally {
                lock.unlockRead(stamp);
            }
        }
        return size;
    }

}
