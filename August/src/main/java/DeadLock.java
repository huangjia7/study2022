import java.util.concurrent.TimeUnit;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);

        Object object1 = new Object();
        Object object2 = new Object();

        MyThread myThread1 = new MyThread(object1,object2,true);
        MyThread myThread2 = new MyThread(object1,object2,false);

        new Thread(myThread1).start();
        new Thread(myThread2).start();
    }

}

class MyThread implements Runnable{
    Object aObj;
    Object bObj;
    boolean myTerm;

    public MyThread(Object aObj, Object bObj, boolean myTerm) {
        this.aObj = aObj;
        this.bObj = bObj;
        this.myTerm = myTerm;
    }

    @Override
    public void run() {
        if(myTerm){
            synchronized (aObj){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("锁住A等B");
                synchronized (bObj){
                    System.out.println("A B 都拿到了");
                }
            }
        }else{
            synchronized (bObj){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("锁住B等A");
                synchronized (aObj){
                    System.out.println("A B 都拿到了");
                }
            }
        }
    }
}