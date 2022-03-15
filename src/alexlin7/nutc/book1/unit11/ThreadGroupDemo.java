package alexlin7.nutc.book1.unit11;

public class ThreadGroupDemo {

    public static void main(String[] args) {
        var group = new ThreadGroup("group") {
            @Override
            public void uncaughtException(
                    Thread thread, Throwable throwable) {
                System.out.printf("%s: %s%n",
                        thread.getName(), throwable.getMessage());
            }};

        var thread = new Thread(group, () -> {
            throw new RuntimeException("測試例外");
        });

        thread.start();
    }
}
