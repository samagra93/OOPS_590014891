import java.io.FileWriter;
import java.io.IOException;

public class UpdateFileContent {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("update.txt", true);
            fw.write("\nThis line is added as updated content.");
            fw.close();
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}