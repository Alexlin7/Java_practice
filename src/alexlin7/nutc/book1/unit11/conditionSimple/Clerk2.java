package alexlin7.nutc.book1.unit11.conditionSimple;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clerk2 {
    private int product = -1;
    private final Lock lock = new ReentrantLock();
    private final Condition productCond = lock.newCondition();
    private final Condition consumerCond = lock.newCondition();

    public void setProduct(int product) throws InterruptedException {
        lock.lock();
        try {
            waitIfFull();
            this.product = product;
            System.out.printf("生產者設定 (%d)%n", this.product);
            consumerCond.signal();
        } finally {
            lock.unlock();
        }
    }

    private void waitIfFull() throws InterruptedException {
        while(this.product != -1) {
            productCond.await();
        }
    }

    public int getProduct() throws InterruptedException {
        lock.lock();
        try {
            waitIfEmpty();
            int p = this.product;
            this.product = -1;
            System.out.printf("消費者取走 (%d)%n", p);
            productCond.signal();
            return p;
        } finally {
            lock.unlock();
        }
    }

    private void waitIfEmpty() throws InterruptedException {
        while(this.product == -1) {
            consumerCond.await();
        }
    }
}
