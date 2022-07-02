package mediatordesignattern;

public class Driver {

    public static void main(String[] args) {

        ATCMediator mediator=new ATCMediatorImpl();

        //Create a few aircraft

        AirCraft boeing1=new AirCraftImpl(mediator,"Boeing 1");
        AirCraft indigo=new AirCraftImpl(mediator,"Indigo");
        AirCraft spiceJet=new AirCraftImpl(mediator,"SpiceJet");

        mediator.addAircraft(boeing1);
        mediator.addAircraft(indigo);
        mediator.addAircraft(spiceJet);

        boeing1.send("Hello from boeing 1");
    }
}
