package lesson8.competition;

public class Main {
    public static void main(String[] args) {
        Participant cat = new Cat("Mars", 2, 300);
        Participant human = new Human("Neymar", 1, 2000);
        Participant robot = new Robot("Shvarts", 3, 1500);
        Obstacle treadmill = new Treadmill(1200);
        Obstacle wall = new Wall(2);

        Participant[] participants = {human, cat, robot};
        Obstacle[] obstacles = {treadmill, wall};

        for (Participant participant : participants) {
            System.out.println(participant.runDistance((Treadmill) treadmill));
            System.out.println(participant.jumpHeight((Wall) wall));
        }

        for (Participant participant : participants)
            for (Obstacle obstacle : obstacles) {
                if (participant.getCondition()) {
                    System.out.println(obstacle.overcome(participant));
                }
            }


    }


}
