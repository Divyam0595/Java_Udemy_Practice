package ExceptionHAndling;

class StackOverflowException extends Exception {
    public String toString() {
        return "Stack Overflow";
    }
}

class StackUnderflowException extends Exception {
    public String toString() {
        return "Stack Underflow";
    }
}

public class Stack {
    int A[] = new int[4];
    private int counter = -1;

    public void push(int i) throws StackOverflowException {
        if (counter >= A.length - 1) {
            throw new StackOverflowException();
        }
        counter++;
        A[counter] = i;
    }

    public int pop() throws StackUnderflowException {
        if (counter == -1) {
            throw new StackUnderflowException();
        }
        return A[counter--];
    }

    public static void main(String args[]) throws Exception {
        try {
            Stack s = new Stack();
            s.push(3);
            s.push(4);
            s.push(6);
            s.push(8);
            s.pop();
            s.push(10);
            System.out.println(s);
        }
        catch(Exception e){

        }

    }

}
