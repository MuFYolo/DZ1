package ru.aston.hometask_4;

public class PrintTask {

    private static final Object MONITOR = new Object();
    private static int nextNum = 1;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MONITOR) {
                    for (int i =0; i < 10; i++) {
                        try {
                            while (nextNum != 1) {
                                MONITOR.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(1);
                        nextNum = 2;
                        MONITOR.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MONITOR) {
                    for (int i =0; i < 10; i++) {
                        try {
                            while (nextNum != 2) {
                                MONITOR.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(2);
                        nextNum = 1;
                        MONITOR.notifyAll();
                    }
                }
            }
        }).start();
    }
}
