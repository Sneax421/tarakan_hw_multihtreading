package ait.multihreading.task;

import java.util.Random;
import java.util.Scanner;

public class TarakanHW {
//    private static final int MAX = 10;
//    private static final int SIZE = 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of tarakans");
        int SIZE = scanner.nextInt();

        System.out.println("Enter distance of race");
        int MAX = scanner.nextInt();

        Runnable[] tasks = new Runnable[SIZE];

        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new MyTaskImplements("Tarakanchik# " + i, MAX);
        }

        Thread[] threads = new Thread[tasks.length];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(tasks[i]);
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();

        }
    }
}
