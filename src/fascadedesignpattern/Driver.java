package fascadedesignpattern;

public class Driver {

    public static void main(String[] args) {

        ComputerFacade computerFacade=new ComputerFacade(new CPU(),new Memory(),new HardDisk());
        computerFacade.start();
    }
}
