package strategyPatternController;

public class Driver {

    public static void main(String[] args) {

        ScoreBoard scoreBoard=new ScoreBoard();
        System.out.println("Ballon Tap Score");

        scoreBoard.algorithmBase=new Ballon();
        scoreBoard.showScore(10,5);

        System.out.println("Clown Tap Score");
        scoreBoard.algorithmBase=new Clowns();
        scoreBoard.showScore(10,5);

    }
}
