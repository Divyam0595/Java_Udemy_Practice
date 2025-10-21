package MultiThreadStudentTeacherExample;

class WhiteBoard {
    int noOfStudents;
    int count = 0;
    String text;

    void attendance() {
        noOfStudents++;
    }

    synchronized void write(String text) {

        while (count != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.text = text;
        count = noOfStudents;
        notifyAll();
    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        count--;
        if (count == 0) notify();
        return text;
    }
}

class Teacher extends Thread {
    WhiteBoard w;

    Teacher(WhiteBoard w) {
        this.w = w;
    }

    public void run() {
        String[] text = {"Hello", "Students", "How", "are", "you","end"};
        for (String x : text) {
            System.out.println("Teacher is writing " + x);
            w.write(x);
        }
    }
}

class Student extends Thread {
    WhiteBoard w;
    String name;

    Student(WhiteBoard w, String name) {
        this.w = w;
        this.name = name;
    }

    public void run() {
        w.attendance();
        String text;
        do {
            text = w.read();
            System.out.println(name + " Student is reading " + text);
            System.out.flush();
        } while (!text.equals("end"));
    }
}

public class TestThread {
    public static void main(String args[]) {
        WhiteBoard w = new WhiteBoard();

        Teacher t = new Teacher(w);
        Student s = new Student(w, "John");
        Student s1 = new Student(w, "Vivek");
        Student s2 = new Student(w, "Thara");

        t.start();
        s.start();
        s1.start();
        s2.start();
    }
}
