package templatedesignpattern;

public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //Template method
    public final void play()
    {
        initialize();
        startPlay();
        endPlay();
        if (addNewGameCharacter()) {
            addNewGameCharacterToTheGame();
        }
    }
    //Hooked on template method
    protected abstract void addNewGameCharacterToTheGame();

    void loadAssets(){
        System.out.println("Loading game assets!");
    }

    boolean addNewGameCharacter()
    {
        return true;
    }
}
