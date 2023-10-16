package ra;

public class TestThread1 implements Runnable {
    public  int tong ;

    public TestThread1() {
        this.tong = 1000;
    }


    public synchronized void rutTien() throws InterruptedException {
        // Thêm từ khoá  synchronized vào trc public ở tên ham thực hieen
        // Thread nào truy xuất trc sẽ vào và khoá lại
        // Thread nào truy xuất sau sẽ check điều kiện khối code đã chiếm vị tris rồi thì sẽ chờ
        if (tong > 0 ) {
            Thread.sleep(1000);
            tong = tong - 1000 ;
            System.out.println(tong);
        } else {
            System.out.println("Khong con tien");
        }
    }

    @Override
    public void run() {
        try {
            rutTien();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestThread1 t = new TestThread1();
        Thread t1 = new Thread(t) ;
        Thread t2 = new Thread(t) ;
        t1.start();
        t2.start();

    }
}
