package ru.aston.hometask_4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Livelock {

    public static void main(String[] args) {
        final Lock resource1 = new ReentrantLock();
        final Lock resource2 = new ReentrantLock();

        new Thread(() -> {
            while (true) {
                try {
                    if (resource1.tryLock(100, TimeUnit.MILLISECONDS)) {
                        if (!resource2.tryLock(100, TimeUnit.MILLISECONDS)) {
                            System.out.println("Livelock");
                            resource1.unlock();
                            Thread.sleep(100);
                        } else {
                            resource2.unlock();
                            resource1.unlock();
                            Thread.sleep(100);
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    if (resource2.tryLock(100, TimeUnit.MILLISECONDS)) {
                        if (!resource1.tryLock(100, TimeUnit.MILLISECONDS)) {
                            System.out.println("Livelock");
                            resource2.unlock();
                            Thread.sleep(100);
                        } else {
                            resource1.unlock();
                            resource2.unlock();
                            Thread.sleep(100);
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}