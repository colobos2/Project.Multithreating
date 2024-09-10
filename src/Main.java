public class Main {
    public static void main(String[] args) throws InterruptedException {
        NewThread newThread = new NewThread();
        newThread.start();

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new MyThread(), "MyThread" + i);
            System.out.println("Поток Thread"+i+ " cтартанул");
            thread.start();
            Thread.sleep(1000);
        }

    }
}

    class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("Поток newThread стартанул");
            for (int i = 0; i < 100; i++) {
                System.out.println("X");
            }
        }
    }

    class MyThread implements Runnable {

        @Override
        public void run() {

            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
