package ss20_solid._1_single_responsibility.wrong;

import ss16_io_text.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Bước 1: Đọc dữ liệu từ file => List
 * Bước 2: CUD => List
 * Bước 3: Ghi List => File
 */
public class StudentService {
    //Thêm 1 sinh viên
    public void add() throws IOException {
        //Bước 1: Đọc dữ liệu từ file => List
        File file = new File("src/ss16_io_text/data/student.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Student> studentList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] info = line.split(",");//info[0] = 1, info[1] = Nguyễn Văn A, info[2] = 8.5
            Student student = new Student(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2]));
            studentList.add(student);
        }
        bufferedReader.close();
        //================= Kết thúc Bước 1 =================

        // Bước 2
        studentList.add(new Student(7, "Nguyễn Văn G", 6.2));

        // Bước 3
        FileWriter fileWriter = new FileWriter(file); //true => ghi tiếp
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student student : studentList) {
            bufferedWriter.write(String.format("%s,%s,%s\n", student.getId(), student.getName(), student.getScore()));
        }
        bufferedWriter.close();
    }
}
