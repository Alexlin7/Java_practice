package alexlin7.nutc.book1.unit11;

public class Tortoise implements Runnable {
    private final int totalStep;
    private int step;

    public Tortoise(int totalStep) {
        this.totalStep = totalStep;
    }

    @Override
    public void run() {
        while (step < totalStep) {
            step++;
            System.out.printf("烏龜跑了 %d 步 ... %n", step);
        }
    }
}
