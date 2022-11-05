package homework9.competition;

public class Main {
    public static void main(String[] args) {

        Participant human = new Human("Jon", 3000, 2);
        Participant cat = new Cat("Mars", 1000, 1);
        Participant robot = new Robot("Shvarts", 10000, 5);
        Obstacle wall = new Wall(2);
        Obstacle treadmill = new Treadmill(1500);

        Participant[] participants = {human, cat, robot};
        Obstacle[] obstacles = {wall, treadmill};

        for (Participant participant: participants) {
            System.out.println(participant.jumpHeight((Wall) wall));
            System.out.println(participant.runDistance((Treadmill) treadmill));
        }

        for (Participant participant: participants)
            for (Obstacle obstacle: obstacles) {
                if(participant.getCondition()) {
                    System.out.println(obstacle.overcome(participant));
                }
            }
    }
}
