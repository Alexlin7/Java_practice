package alexlin7.nutc.book1.unit11.demo;

public class Consumer implements Runnable {
    private final Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println("消費者開始消耗整數...");
        for (int i = 0; i <= 10; i++) {
            try {
                clerk.getProduct();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
