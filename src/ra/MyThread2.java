package ra;

public class MyThread2 extends Thread{
    /*
   extends Thread
   - tao ra nhieu luong cong viec chay dong lap voi nhau
   * */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B " + i);
        }
    }

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
