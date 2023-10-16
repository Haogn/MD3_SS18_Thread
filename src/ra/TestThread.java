package ra;

public class TestThread extends Thread  {
    private String threadName ;

    public TestThread(){

    }

    public TestThread(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(this.getThreadName()+ " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread("A");
        TestThread t2 = new TestThread("B");
        t1.start();
        t2.start();
    }
}
