package lesson7;

public class Cat extends Animal {

    private final int maxRun = 200;
    private final int maxSwim = 0;
    static int count;

    public Cat() {
        count++;
    }

    @Override
    public void run(int lengthWay) {
        if(lengthWay <= maxRun) {
            System.out.println(getName() + " run " + lengthWay + " meters");
        } else System.out.println(getName() + " need a break to rest ");
    }

    @Override
    public void swim(int lengthWay) {
        if(lengthWay <= maxSwim) {
            System.out.println(getName() + " swam " + lengthWay + " meters");
        } else System.out.println(getName() + " can't swim ");
    }


}
