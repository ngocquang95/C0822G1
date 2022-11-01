package ss20_solid._1_single_responsibility.right.util;

import ss16_io_text.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<Student> readFile() throws IOException {
        File file = new File("src/ss16_io_text/data/student.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Student> studentList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            try {
                String[] info = line.split(",");//info[0] = 1, info[1] = Nguyễn Văn A, info[2] = 8.5
                Student student = new Student(Integer.parseInt("sdfsdfsd"), info[1], Double.parseDouble(info[2]));
                studentList.add(student);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        bufferedReader.close();

        return studentList;
    }
}
