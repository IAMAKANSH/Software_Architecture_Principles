package commandpattern;

public class GameBoy {
    private Command upCommand;
    private Command downCommand;
    private Command rightCommand;
    private Command leftCommand;

    public GameBoy(Command upCommand, Command downCommand, Command rightCommand, Command leftCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
        this.rightCommand = rightCommand;
        this.leftCommand = leftCommand;
    }

    public  void arrowUp()
    {
        upCommand.execute();
    }

    public  void arrowDown()
    {
        downCommand.execute();
    }

    public  void arrowRight()
    {
        rightCommand.execute();
    }
    public  void arrowLeft()
    {
        leftCommand.execute();
    }

}
