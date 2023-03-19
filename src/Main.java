import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// Задание 1

        Thread MyThread = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 60; i++) {
                    try {
                        sleep(1000l);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("С начала сессии прошло " + i + " секунд(a)");
                }
            }
        };
        MyThread.start();

        Thread MyThread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 60; i++) {
                    if (i % 5 == 0) {
                        try {
                            sleep(5000l);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Прошло " + i + " секунд");
                    }
                }
            }
        };
        MyThread2.start();


// Задание 2
        Thread MyThread3 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 60; i++) {
                    if (i % 7 == 0) {
                        try {
                            sleep(7000l);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Прошло " + i + " секунд");
                    }
                }
            }
        };
        MyThread3.start();

    }
}