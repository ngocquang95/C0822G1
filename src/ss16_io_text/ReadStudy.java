package ss16_io_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss16_io_text/data/input.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

//        while (true) {
//            line = bufferedReader.readLine();
//            if (line == null) {
//                break;
//            }
//            System.out.println(line);
//        }
        bufferedReader.close();
    }
}
