import java.util.Scanner;
public class Game {
    Level leveltwo = new Level();
    Level levelthree = new Level();
    Level levelone = new Level();
    private boolean bonus;

    public class Level {
        private boolean goalReached;
        private int points;

        public boolean getGoalReached() {
            return goalReached;
        }

        public void setGoalReached(boolean reached) {
            goalReached = reached;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int p) {
            points = p;
        }
    }

    public boolean goalReached() {
        return levelone.getGoalReached();
    }

    public int setPoints(int p) {
        levelone.setPoints(p);
        return levelone.getPoints();
    }

    public boolean isBonus() {
        return bonus;
    }

    public void makeBonus() {
        bonus = true;
    }

    public Level getLevel(int i) {
        if (i == 0) return levelone;
        if (i == 1) return leveltwo;
        if (i == 2) return levelthree;
        return null;
    }

    public int getScore() {
        int points = 0;
        if (levelone.getGoalReached()) {
            points += levelone.getPoints();
            if (leveltwo.getGoalReached()) {
                points += leveltwo.getPoints();
                if (levelthree.getGoalReached()) {
                    points += levelthree.getPoints();
                }
            }
        }
    
        if (bonus) {
            points = 3 * points;
        }
    
        return points;
    }

    public void play(){
        System.out.println("Enter the number of points");
        Scanner s = new Scanner(System.in);
        levelone.setPoints(s.nextInt());
        levelone.setGoalReached(true);
    }

    public int playManyTimes(int num){
        int max = 0;
        while (num>0){
            play();
            int score = getScore();
            if(score > max) max = score;
            num--;
        }
        return max;
    }
}
