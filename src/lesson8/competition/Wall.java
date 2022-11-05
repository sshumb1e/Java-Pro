package lesson8.competition;

public class Wall extends Obstacle {

    public Wall(int size) {
        super(size);
    }

    @Override
    public String overcome(Participant participant) {
        participant.setCondition(participant.getMaxHeight() >= getSize());
        if(participant.getCondition()) {
            return participant.getName() + " has overcome the wall and move to the next obstacle";
        } else {
            return participant.getName() + " has lost and eliminated";
        }
    }
}
