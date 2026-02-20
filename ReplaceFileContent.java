import java.io.FileWriter;
import java.io.IOException;

public class ReplaceFileContent {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("replace.txt");
            fw.write("This content has replaced the old content.");
            fw.close();
            System.out.println("File content replaced successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}