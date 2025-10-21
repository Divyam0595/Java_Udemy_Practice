package IOStreams;

import java.io.*;

class Producer extends Thread {

    int count = 0;
    OutputStream os;

    public Producer(OutputStream os) {
        this.os = os;

    }
    public void run() {
        try {
            while (true) {
                os.write(count);
                Thread.sleep(10);
                System.out.println("Producer " + count);
                os.flush();
                System.out.flush();
                count++;

            }
        } catch (Exception e) {}
    }

}

class Consumer extends Thread {
    InputStream is;
    public Consumer(InputStream is) {
        this.is = is;
    }
    public void run() {
        try {

            while (true) {
                int x= is.read();
                Thread.sleep(10);
                System.out.println("Consumer "+x);
                System.out.flush();

            }
        } catch (Exception e) {}
    }

}

public class PipedStreams {
    public static void main(String args[]) throws Exception{
        PipedInputStream ps= new PipedInputStream();
        PipedOutputStream pos= new PipedOutputStream();

        Producer p= new Producer(pos);
        Consumer c= new Consumer(ps);

        ps.connect(pos);

        p.start();c.start();



    }
}
