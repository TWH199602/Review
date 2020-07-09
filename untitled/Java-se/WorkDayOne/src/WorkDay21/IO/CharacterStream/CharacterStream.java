package WorkDay21.IO.CharacterStream;

import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        //InputStream / OutputStream

//        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(demo))){
//            bufferedWriter.write("你好");
//            bufferedWriter.newLine();
//        }
        File demo = new File("demo.txt");
        try (Writer writer = new FileWriter(demo)){
         writer.write("hi");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Reader reader = new FileReader(demo)){
            char[] buf = new char[1024];
            int read = reader.read(buf);
            while (read > 0){
//                System.out.println(Character.highSurrogate(read));
                System.out.println(new String(buf,0,read));
                read = reader.read(buf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        }
    }

