package alexlin7.nutc.book1.unit11;

class Variable {
    //static int i = 0 ,j = 0;
    volatile static int i = 0 ,j = 0;

    static synchronized void one() {
        i++;
        j++;
    }

    static synchronized void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}

public class VariableTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Variable.one();
            }
        });
        Thread thread2 = new Thread(() -> {
            while(true){
                Variable.two();
            }
        });
        thread1.start();
        thread2.start();
    }
}
