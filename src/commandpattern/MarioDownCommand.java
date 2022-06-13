package commandpattern;

public class MarioDownCommand  implements  Command{

    private MarioReciever marioReciever;

    public MarioDownCommand(MarioReciever marioReciever) {
        this.marioReciever = marioReciever;
    }

    @Override
    public void execute() {
        marioReciever.jumpDown();
    }
}
