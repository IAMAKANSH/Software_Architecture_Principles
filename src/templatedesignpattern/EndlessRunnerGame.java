package templatedesignpattern;

public class EndlessRunnerGame extends Game{
    @Override
    void initialize() {
        System.out.println("Endless Runner is initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Endless Runner starting...");

    }

    @Override
    void endPlay() {
        System.out.println("Endless Runner ending....");
    }

    @Override
    protected void addNewGameCharacterToTheGame() {
        System.out.println("Adding new character to the game");
    }


    //Add more methods...
}
