package alexlin7.nutc.book1.unit11;

public class DaemonDemo {
    public static void main(String[] args) {
        var thread = new Thread(() -> {
            while (true) {
                System.out.println("Orz");
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

}
