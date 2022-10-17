package lesson8.competition;

public class Wall extends Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    String overcome(Participant participant) {
        participant.setCondition(participant.inMaxHeight() >= height);
        if (participant.getCondition()) {
            return participant.getName() + " has overcome the wall with height " + height +" and move to the next obstacle";
        } else return participant.getName() + " has not overcome the wall and out from competition";
    }
}
