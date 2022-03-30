package alexlin7.nutc.book1.unit11.executorSimple;

import java.util.concurrent.Executor;

public class DirectExecutor implements Executor {
    @Override
    public void execute(Runnable r) {
        //r.run();
        new Thread(r).start();
    }
}
