public class Main {

    public static void main(String[] args){
        Game one = new Game();
        one.getLevel(0).setGoalReached(true);
        one.getLevel(0).setPoints(200);
        one.getLevel(1).setGoalReached(false);
        one.getLevel(1).setPoints(100);
        one.getLevel(2).setGoalReached(false);
        one.getLevel(2).setPoints(500);
        one.makeBonus();

        System.out.println(one.getScore()); 

        Game two = new Game();
        two.getLevel(0).setGoalReached(true);
        two.getLevel(0).setPoints(200);
        two.getLevel(1).setGoalReached(false);
        two.getLevel(1).setPoints(100);
        two.getLevel(2).setGoalReached(false);
        two.getLevel(2).setPoints(500);
        two.makeBonus();

        System.out.println(two.getScore()); 

        Game five = new Game();
        System.out.println(five.playManyTimes(4));
    }
}
