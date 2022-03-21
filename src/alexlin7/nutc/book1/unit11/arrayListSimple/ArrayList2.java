package alexlin7.nutc.book1.unit11.arrayListSimple;

import java.util.Arrays;
import java.util.concurrent.locks.*;

public class ArrayList2<E> {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private Object[] elems;
    private int next = 0;

    public ArrayList2(int capacity) {
        elems = new Object[capacity];
    }

    public ArrayList2() {
        this(16);
    }

    public void add(E elem) {
        lock.writeLock();
        try {
            if(next == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[next++] = elem;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public E get(int index) {
        lock.readLock();
        try {
            return (E) elems[index];
        } finally {
            lock.readLock().unlock();
        }
    }

    public int size() {
        lock.readLock();
        try {
            return next;
        } finally {
            lock.readLock().unlock();
        }
    }

}
