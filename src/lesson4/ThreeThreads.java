package lesson4;

public class ThreeThreads {
    static volatile char variable = 'A';
    static Object mon = new Object();

    public static void main(String[] args) {
        new Thread(()-> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (variable != 'A') {
                            mon.wait();
                        }
                        System.out.println("A");
                        variable = 'B';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()-> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (variable != 'B') {
                            mon.wait();
                        }
                        System.out.println("B");
                        variable = 'C';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()-> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (variable != 'C') {
                            mon.wait();
                        }
                        System.out.println("C");
                        variable = 'A';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
