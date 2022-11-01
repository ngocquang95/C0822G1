package ss16_io_text;

import java.io.*;

public class WriteStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss16_io_text/data/output.txt");
        FileWriter fileWriter = new FileWriter(file); //true => ghi tiếp
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Nguyễn Văn C\n");
        bufferedWriter.write("Nguyễn Văn E\n");
        bufferedWriter.write("Nguyễn Văn F\n");
        bufferedWriter.write("Nguyễn Văn D");
        bufferedWriter.newLine();


        bufferedWriter.close();
    }
}
