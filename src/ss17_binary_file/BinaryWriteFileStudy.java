package ss17_binary_file;

import ss17_binary_file.model.Address;
import ss17_binary_file.model.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
Copy file nguồn => đích
Bước 1: Tạo file nguồn bằng cơm
Bước 2: Tạo file đích bằng cơm
Bước 3: Viết dữ liệu vào file nguồn => Phải sử dụng FileOutputStream => Quan trọng nhất
Bước 4: Đọc file nguồn => Object
Bước 5:Object => ghi ra file đích

 */
public class BinaryWriteFileStudy {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file/data/data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Nguyễn Văn A", 8.2, new Address(1, "Đà Nẵng")));
        studentList.add(new Student(2, "Nguyễn Văn B", 8.9));
        studentList.add(new Student(3, "Nguyễn Văn C", 4.2));

        objectOutputStream.writeObject(studentList);

        objectOutputStream.close();
    }
}
