package IOStreams;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String args[]) throws Exception{
        RandomAccessFile ra = new RandomAccessFile(new File("/Users/vivek_ravi/Documents/Divya_automation/Code.txt"),"rw");
        System.out.println(ra.readLine());
        ra.seek(4);
        System.out.println(ra.getFilePointer());

    }
}
