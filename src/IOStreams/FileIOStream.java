package IOStreams;

import javax.imageio.stream.FileImageInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileIOStream {

    public static void main(String args[]) {
        try {
            BufferReaderMethod();
        }catch (Exception e) {}
        /*try (FileReader os = new FileReader("/Users/vivek_ravi/Documents/Divya_automation/Code.txt")) {
            int x = 0;
            while ((x = os.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (Exception e) {
        }*/
    }


    public static void BufferReaderMethod() throws Exception{

        FileInputStream fs = new FileInputStream("/Users/vivek_ravi/Documents/Divya_automation/Code.txt");
        BufferedInputStream bs= new BufferedInputStream(fs);
        int x = 0;
        while ((x = bs.read()) != -1) {
            System.out.print((char) x);
        }


    }
}
