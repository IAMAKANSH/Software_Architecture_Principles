package mementodesignpattern;

public class Originator {

    private String state;

    public Originator() {
    }

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento()
    {
        return new Memento(state);
    }

    public void setMemento(Memento memento)
    {
        state=memento.getState();
    }
}
