package ait.multihreading.task;

import java.util.Random;

public class MyTaskImplements implements Runnable{
    private String name;
    private int max;
    private static final int MILLI = new Random().nextInt(4) + 2;
    private static String winner = null;


    public MyTaskImplements(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            try {
                Thread.sleep(MILLI);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + ", count = " + i);
        }
        if (winner == null) {
            winner = name;
            System.out.println("Congratulations to " + winner + " (winner)");
        }

    }
}
