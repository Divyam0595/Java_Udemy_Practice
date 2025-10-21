package LocalStaticAnnonymousInnerClass;

class DataOject {

    int value;
    boolean flag = true;

    synchronized void set(int x) {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        value = x;
        flag = false;
        notify();


    }

    synchronized int getValue() {
        int x = 0;
        while (flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    DataOject d;

    Producer(DataOject d) {
        this.d = d;
    }

    int i = 0;

    public void run() {
        while (true) {
            d.set(i);
            System.out.println("Producer " + i);
            i++;
        }
    }
}

class Consumer extends Thread {
    DataOject d;

    Consumer(DataOject d) {
        this.d = d;
    }

    public void run() {
        while (true) {
            System.out.println("Consumer " + d.getValue());
        }
    }
}

public class TestThread1 {
    public static void main(String args[]) {
        DataOject data = new DataOject();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();

    }


}
