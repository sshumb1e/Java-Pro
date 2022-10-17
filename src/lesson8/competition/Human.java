package lesson8.competition;

public class Human extends Participant {

    private String name;
    private int maxHight;
    private int maxDistance;
    private boolean condition = true;

    public Human(String name, int maxHight, int maxDistance) {
        this.name = name;
        this.maxHight = maxHight;
        this.maxDistance = maxDistance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getCondition() {
        return condition;
    }

    @Override
    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public int inMaxDistance() {
        return maxDistance;
    }

    @Override
    public int inMaxHeight() {
        return maxHight;
    }

    @Override
    public String runDistance(Treadmill treadmill) {
        if (treadmill.getDistance() <= maxDistance) {
            return name + " is able to run distance " + maxDistance;
        }else return name + " is not able to run the distance " + maxDistance;
    }

    @Override
    public String jumpHeight(Wall wall) {
        if (wall.getHeight() <= maxHight) {
            return name + " is able to overcome the wall with height in " + maxHight;
        } else return name + " is not able to overcome the wall with height in " + maxHight;
    }
}
