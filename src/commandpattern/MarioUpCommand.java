package commandpattern;

public class MarioUpCommand implements Command{

    private MarioReciever marioCharacter;

    public MarioUpCommand(MarioReciever marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {

        marioCharacter.jumpUp();

    }
}
