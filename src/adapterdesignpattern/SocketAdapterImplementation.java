package adapterdesignpattern;

public class SocketAdapterImplementation extends Socket implements SocketAdapter{
    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v=getVolt();
        return convert(v,10);
    }

    @Override
    public Volt get3Volts() {
        Volt v=getVolt();
        return convert(v,40);
    }

    @Override
    public Volt get1Volts() {
        Volt c=getVolt();
        return convert(c,120);
    }

    private  Volt convert(Volt v,int i){
        return new Volt(v.getVolts()/i);
    }
}
