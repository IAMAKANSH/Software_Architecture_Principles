package interpreterdesignpattern;

public class Driver {

    public InterpreterContext interpreterContext;
    public Driver(InterpreterContext interpreterContext) {
        this.interpreterContext=interpreterContext;
    }

    public static void main(String[] args) {

        String first="13 in Binary";
        String second="28 in Hexadecimal";
        Driver interpreter=new Driver(new InterpreterContext());
        System.out.println(first+" = "+interpreter.interpret(first));
        System.out.println(second+" = "+interpreter.interpret(second));
    }

    public String interpret(String str)
    {
        Expression expression=null;
        int i = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        if (str.contains("Hexadecimal"))
        {
            expression=new IntToHex(i);
        }
        else if (str.contains("Binary"))
        {
            expression=new IntToBinaryExpression(i);
        }
        else
        {
            return str;
        }
        return expression.interpreter(interpreterContext);

    }
}
