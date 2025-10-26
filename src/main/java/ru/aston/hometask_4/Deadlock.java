package ru.aston.hometask_4;

public class Deadlock {
    private int amount1;
    private int amount2;

    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public Deadlock(int amount1, int amount2) {
        this.amount1 = amount1;
        this.amount2 = amount2;
    }

    public void from1To2(int amount) {
        synchronized (monitor1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (amount <= amount1) {
                System.out.println("Deadlock");
                synchronized (monitor2) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    amount1 -= amount;
                    amount2 += amount;
                }
            } else {
                System.out.println("Work");
            }
        }
    }

    public void from2To1(int amount) {
        synchronized (monitor2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (amount <= amount2) {
                System.out.println("Deadlock");
                synchronized (monitor1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    amount2 -= amount;
                    amount1 += amount;
                }
            } else {
                System.out.println("Work");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Deadlock deadlock = new Deadlock(1000, 1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.from1To2(300);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.from2To1(300);
            }
        }).start();
    }
}
