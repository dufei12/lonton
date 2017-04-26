package dd9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * @author dufei
 */
public class S {
  public static void main(String[] args) throws IOException {
        int n = -1;
        int j = 100;
        byte a[] = new byte[j];
        // System.getProperties().put("file.encoding", "GDK");
        File inputFile = new File("D:\\", "test1.txt");
        File outputFile = new File("D:\\", "test2.txt");
        InputStream in = new FileInputStream(inputFile);
        OutputStream out = new FileOutputStream(outputFile, true);
        // BufferedReader br=new BufferedReader(new InputStreamReader(in,"UTF-8"));
        // String str=br.readLine();
        while ((n = in.read(a, 0, j)) != -1) {
            // String str=new String(a,0,n);
            // out.write(str.getBytes());
            out.write(a);
            System.out.println(Arrays.toString(a));
            // System.out.println(str);
        }
        //out.flush();
        in.close();
        out.close();
        System.out.println("25325");
		System.out.println("杜俊第一次修改！");
		
		System.out.println("杜俊第二次次修改！");
    }
}
