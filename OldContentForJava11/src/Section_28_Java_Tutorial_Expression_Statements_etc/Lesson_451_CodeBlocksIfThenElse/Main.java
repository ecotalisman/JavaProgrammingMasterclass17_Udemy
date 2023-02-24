package Section_28_Java_Tutorial_Expression_Statements_etc.Lesson_451_CodeBlocksIfThenElse;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


//        if (score < 5000 && score > 1000 ) {
//            System.out.println("Your score less than 5000 but greater than 1000");
//        } else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }


//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (newGameOver){
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        int highScorePosition = 1500;
        displayHighScorePosition("Tim", calculateHighScorePosition(highScorePosition));

        highScorePosition = 900;
        displayHighScorePosition("Bob", calculateHighScorePosition(highScorePosition));

        highScorePosition = 400;
        displayHighScorePosition("Percy", calculateHighScorePosition(highScorePosition));

        highScorePosition = 50;
        displayHighScorePosition("Gilbert", calculateHighScorePosition(highScorePosition));

        highScorePosition = 1000;
        displayHighScorePosition("Louise", calculateHighScorePosition(highScorePosition));

        highScorePosition = 500;
        displayHighScorePosition("Carol", calculateHighScorePosition(highScorePosition));

        highScorePosition = 100;
        displayHighScorePosition("Frank", calculateHighScorePosition(highScorePosition));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;

        int position = 4; // assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

}
