package alexlin7.nutc.book1.unit11.Demo;

public class Clerk {
    private int product = -1;
    private boolean flag = true;

    public synchronized void setProduct(int product) throws InterruptedException{
        waitIfFull();
        this.product = product;
        System.out.printf("生產者設定 (%d)%n", this.product);
        notify();
    }

    private synchronized void waitIfFull() throws InterruptedException{
        while (this.product != -1) {
            wait();
        }
    }

    public synchronized void getProduct() throws InterruptedException{
        waitIfEmpty();
        int p = this.product;
        if(this.product == 10) flag = false;
        this.product = -1;
        System.out.printf("消費者取走 (%d)%n", p);
        notify();
    }

    private synchronized void waitIfEmpty() throws  InterruptedException{
        if(!flag) throw new InterruptedException("出貨完畢");
        while (this.product == -1) {
            wait();
        }
    }


}
