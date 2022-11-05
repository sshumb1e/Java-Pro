package homework7;

public class Dog extends Animal {

    private final int maxRun = 500;
    private final int maxSwim = 10;
    static int count;

    public Dog() {
        count++;
    }

    @Override
    public void run(int lengthWay) {
        if(lengthWay <= maxRun) {
            System.out.println(getName() + " run " + lengthWay + " meters");
        }else System.out.println(getName() + " need break to rest and drink water ");
    }

    @Override
    public  void swim(int lengthWay) {
        if(lengthWay <= maxSwim) {
            System.out.println(getName() + " swam " + lengthWay + " meters");
        } else System.out.println(getName() + " can't swim this way");
    }

}
