package IOStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PracticeStreams {

    public static void main(String args[]) throws Exception{
        Float[] a= {12.5f,32.4f,23.5f};

        FileOutputStream fs= new FileOutputStream("/Users/vivek_ravi/Documents/Divya_automation/test.txt");
        DataOutputStream ds= new DataOutputStream(fs);
        ds.writeInt(a.length);
        for(float b:a ){
            ds.writeFloat(b);
        }

        ds.close();
        fs.close();

        FileInputStream fis= new FileInputStream("/Users/vivek_ravi/Documents/Divya_automation/test.txt");
        DataInputStream dis= new DataInputStream(fis);
        int len= dis.readInt();
        for(int i=0;i<len;i++){
            System.out.println(dis.readFloat());
        }

        dis.close();
        fis.close();


    }
}
