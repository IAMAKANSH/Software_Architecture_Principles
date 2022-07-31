package interpreterdesignpattern;

public class IntToHex implements  Expression{

    private int i;

    public IntToHex(int i) {
        this.i = i;
    }

    @Override
    public String interpreter(InterpreterContext interpreterContext) {
        return interpreterContext.getHexFormat(i);
    }
}
