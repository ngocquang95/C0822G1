package ss7_abstract_interface;

public abstract class Animal { //Không cho phép tạo đối tượng
    private int id;
    private String name;

    public abstract void tiengKeu(); // Không có body

    //    public abstract void tiengKeu2(); // Không có body
    public void eat() {
        System.out.println("Đông vật ăn");
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
}
