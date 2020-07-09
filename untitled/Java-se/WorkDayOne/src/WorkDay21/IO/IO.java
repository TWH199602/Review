package WorkDay21.IO;

import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException {
        String words = "to be number one";
        File file = new File("Demo101.txt");
        file.createNewFile();
        try {
            OutputStream os = new FileOutputStream(file);
            os.write(words.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
