package ss20_solid._1_single_responsibility.right;

import ss16_io_text.model.Student;
import ss20_solid._1_single_responsibility.right.util.ReadFileUtil;

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
        List<Student> studentList = ReadFileUtil.readFile();
        //================= Kết thúc Bước 1 =================

        // Bước 2
        studentList.add(new Student(7, "Nguyễn Văn G", 6.2));

        // Bước 3
//        FileWriter fileWriter = new FileWriter(file); //true => ghi tiếp
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//        for (Student student : studentList) {
//            bufferedWriter.write(String.format("%s,%s,%s\n", student.getId(), student.getName(), student.getScore()));
//        }
//        bufferedWriter.close();
    }
}
