package homework9.competition;


public class Robot extends Participant {

    public Robot(String name, int maxDistance, int maxHeight) {
        super(name, maxDistance, maxHeight);
    }

    @Override
    public String jumpHeight(Wall wall) {
        if(wall.getSize() < getMaxHeight()) {
            return getName() + " overcome the wall in " + wall.getSize() + " meters";
        } else {
            return getName() + " can't overcome the wall ";
        }
    }

    @Override
    public String runDistance(Treadmill treadmill) {
        if (treadmill.getSize() < getMaxDistance()) {
            return getName() + " run the distance in " + treadmill.getSize() + " meters";
        } else {
            return getName() + " can't run the distance";
        }
    }
}
