package WorkDay21.IO.SplitFile;

import java.io.*;

/**
 * /**
 *    * @param sourceFile   目标文件
 *    * @param size         拆分文件大小 byte为单位
 *    * @param targetFolder 生成的拆分文件路径，如果传入的路径不存在，则创建这个路径
 *    *                     拆分文件的命名规则，原始文件名.编号。
 *    *                     例如 WIN.mp3 拆分后，变为 WIN.mp3.1  WIN.mp3.2 ....
 *    *                     void split(File sourceFile,int size,File targetFolder);
  *    * 将制定文件夹下的拆分文件合并为一个文件，将文件保存到指定的路径下
  *    *
  *    * @param sourceFolder 拆分文件所处的路径，其下的文件命名规则，同split拆分出来的文件名一致
  *    * @param targetFolder 合并之后的文件保存的路径，如果路径不存在，则创建这个目录
  *    *void combine(File sourceFolder,File targetFolder);
 */
//"/Users/edz/Desktop/demo/WorkDayOne/Review/untitled/Java-se/WorkDayOne/src/WorkDay21/IO/SplitFile/WIN.mp3"
public class SplitFile {

    public static void split(File sourceFile, int size, File targetFolder) throws IOException {
            InputStream is = new FileInputStream(sourceFile);
            OutputStream os = new FileOutputStream(targetFolder);
                byte[] buf = new byte[size];
                int count = is.read(buf);
                if(count > 0){
                    os.write(buf,0,count);
                    os.close();
            }
                is.close();
        }

        public void combine(File sourceFile, int size ,File targetFolder) throws IOException {
            InputStream is = new FileInputStream(sourceFile);
            OutputStream os = new FileOutputStream(targetFolder);
            byte[] buf = new byte[size];
            int count = 0;
            int index = 1;
            while ((count = is.read(buf)) > 0) {
                os.write(buf,0,count);
                os.close();
            }
            is.close();
        }

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/edz/Desktop/demo/WorkDayOne/Review/untitled/Java-se/WorkDayOne/src/WorkDay21/IO/SplitFile/WIN/WIN.mp3");
        File file1 = new File("/Users/edz/Desktop/demo/WorkDayOne/Review/untitled/Java-se/WorkDayOne/src/WorkDay21/IO/SplitFile/WIN");
        if(file.exists()){
            file.mkdir();
        }
        split(file,9*1024,file1);
    }
}
