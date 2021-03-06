package alexlin7.nutc.book1.unit11;

public class Hare implements Runnable{
    private final boolean[] flags = {true, false};
    private final int totalStep;
    private int step;

    public Hare(int totalStep) {
        this.totalStep = totalStep;
    }

    @Override
    public void run() {
        while (step < totalStep) {
            boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];
            if (!isHareSleep) {
                System.out.println("兔子睡著ㄌ");
            } else {
                step += 2;
                System.out.printf("兔子跑了 %d 步... %n", step);
            }
        }
    }
}
