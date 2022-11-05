package homework9.competition;

public class Treadmill extends Obstacle {

    public Treadmill(int size) {
        super(size);
    }

    @Override
    public String overcome(Participant participant) {
        participant.setCondition(participant.getMaxDistance() >= getSize());
        if (participant.getCondition()) {
            return participant.getName() + " has run the distance and move on to the next obstacle";
        } else {
            return participant.getName() + " has lost and eliminated";
        }
    }
}
