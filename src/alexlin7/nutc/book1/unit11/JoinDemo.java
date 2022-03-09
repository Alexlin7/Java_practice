package alexlin7.nutc.book1.unit11;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread 開始...");

        Thread threadB = new Thread(() -> {
            System.out.println("thread B ...開始");
            for(int i = 0; i < 5; i++) {
                System.out.println("thread B 執行...");
            }
            System.out.println("thread B 將結束");
        });

        threadB.start();
        threadB.join();

        System.out.println("Main thread 將結束");
    }
}
