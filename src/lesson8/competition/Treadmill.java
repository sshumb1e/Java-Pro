package lesson8.competition;

public class Treadmill extends Obstacle {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    String overcome(Participant participant) {
        participant.setCondition(participant.inMaxDistance() >= distance);
        if (participant.getCondition()) {
            return participant.getName() + " has run the distance " + distance + " and move on";
        } else return participant.getName() + " has not run the treadmill and out from competition";
    }
}
