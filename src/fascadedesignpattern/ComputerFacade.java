package fascadedesignpattern;

public class ComputerFacade {

    private CPU processor;
    private Memory memory;
    private HardDisk hardDisk;

    public ComputerFacade(CPU processor, Memory memory, HardDisk hardDisk) {
        this.processor = processor;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public void start()
    {
        processor.freeze();
        memory.load(132, hardDisk.read(3456,89));
        processor.jump(132);
        processor.execute();
    }
}
