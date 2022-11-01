package ss17_binary_file;

import ss17_binary_file.model.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class BinaryReadFileStudy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/ss17_binary_file/data/data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Student> studentList = (List<Student>) objectInputStream.readObject();

        for (Student student : studentList) {
            System.out.println(student);
        }

        objectInputStream.close();
    }
}
