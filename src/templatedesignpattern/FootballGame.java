package templatedesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootballGame extends Game{
    @Override
    void initialize() {
        System.out.println("Football is initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Football starting...");
    }

    @Override
    void endPlay() {
        System.out.println("Football Runner ending....");
        playerWantNewCharacter();
    }

    @Override
    protected void addNewGameCharacterToTheGame() {
        System.out.println("Adding new character to the game");
    }

    public boolean playerWantNewCharacter()
    {
        String answer=getUserInput();
        if (answer.toLowerCase().startsWith("y"))
            return true;
        return false;
    }

    private String getUserInput() {
        String answer=null;
        System.out.println("Would you like to add a new character to the game (y/n)?");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer=bufferedReader.readLine();
        }catch (IOException ex)
        {
            System.out.println("IO exception");
        }
        if (answer==null)
            return "no";

        return answer;
    }
    //Add more methods...
}
