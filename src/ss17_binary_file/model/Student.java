package ss17_binary_file.model;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private transient Double score;
    private Address address;

    public Student() {
    }

    public Student(int id, String name, Double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student(int id, String name, Double score, Address address) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", address=" + address +
                '}';
    }
}
