package lesson8.competition;

public abstract class  Participant {

    public abstract String getName();
    public abstract boolean getCondition();
    public abstract void setCondition(boolean condition);


    public abstract int inMaxDistance();

    public abstract int inMaxHeight();

    public abstract String runDistance(Treadmill treadmill);

    public abstract String jumpHeight(Wall wall);

}