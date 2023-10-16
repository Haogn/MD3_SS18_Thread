package ra;

public class MyThread1 implements Runnable{
    /*
    implements Runnable
    co the truy xuat tu nhieu Thread goi vao
    * */

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A " + i);
        }
    }
}
