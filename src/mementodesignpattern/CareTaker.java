package mementodesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> stateList=new ArrayList();

    public void addMomento(Memento memento)
    {
        stateList.add(memento);
    }
    public Memento getMemento(int index)
    {
        return stateList.get(index);
    }
}
