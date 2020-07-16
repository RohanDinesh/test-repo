public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread(),"Thread1");
        Thread t2 = new Thread(new MyThread(),"Thread2"); //Thread t2 = new Thread();
        Thread t3 = new Thread(new MyThread(),"Thread3"); //Thread t3 = new Thread();

        t1.start();
        t2.start();

        t1.join();
        t3.start();

    }

    static class MyThread implements Runnable{

        @Override
        public void run() {
            System.out.println("Active Threads: "+Thread.activeCount());
            System.out.println("Start Thread: "+Thread.currentThread().getName());
            System.out.println("Start Threaddd: "+Thread.currentThread());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("End Thread: "+Thread.currentThread().getName());
        }
    }


}
