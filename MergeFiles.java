import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFiles {
    public static void main(String[] args) {
        try {
            FileReader fr1 = new FileReader("file1.txt");
            FileReader fr2 = new FileReader("file2.txt");
            FileWriter fw = new FileWriter("merged.txt");

            int i;
            while((i = fr1.read()) != -1) {
                fw.write(i);
            }

            while((i = fr2.read()) != -1) {
                fw.write(i);
            }

            fr1.close();
            fr2.close();
            fw.close();

            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}