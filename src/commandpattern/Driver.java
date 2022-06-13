package commandpattern;

public class Driver {

    public static void main(String[] args) {


        MarioReciever marioReciever=new MarioReciever();
        marioReciever.setName("Mario");

        KirbyCharacterReceiver kirbyCharacterReceiver=new KirbyCharacterReceiver();
        kirbyCharacterReceiver.setName("Kirby");


        //Create command
        MarioUpCommand marioUpCommand=new MarioUpCommand(marioReciever);
        MarioDownCommand marioDownCommand=new MarioDownCommand(marioReciever);

        KirbyDownCommand kirbyDownCommand=new KirbyDownCommand(kirbyCharacterReceiver);
        KirbyUpCommand kirbyUpCommand=new KirbyUpCommand(kirbyCharacterReceiver);

        GameBoy gameBoy=new GameBoy(marioUpCommand,marioDownCommand,null,null);
        gameBoy.arrowUp();
    }
}
