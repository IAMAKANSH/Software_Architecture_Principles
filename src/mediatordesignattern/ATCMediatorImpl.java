package mediatordesignattern;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator{
    private List<AirCraft> airCrafts;

    public ATCMediatorImpl() {
        this.airCrafts = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, AirCraft airCraft) {
        for (AirCraft airCraft1:airCrafts
             ) {
            if(airCraft1!=airCraft)
            {
                airCraft1.receive(message);
            }
        }
    }

    @Override
    public void addAircraft(AirCraft airCraft) {
        this.airCrafts.add(airCraft);
    }
}
