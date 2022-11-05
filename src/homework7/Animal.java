package homework7;

public class Animal {
    private String name;
    static int count;

    public Animal() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {

    }
    public void swim(int distance) {

    }
}
