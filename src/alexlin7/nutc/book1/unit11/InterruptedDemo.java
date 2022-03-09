package alexlin7.nutc.book1.unit11;

public class InterruptedDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(99999);
            } catch(InterruptedException ex) {
                System.out.println("起床");
                throw new RuntimeException(ex);
            }
        });
        thread.start();
        thread.interrupt();
    }


}
