package mementodesignpattern;

public class Driver {
    public static void main(String[] args) {

        Originator originator=new Originator();
        originator.setState("Monster");

        Memento memento=originator.createMemento();

        CareTaker careTaker=new CareTaker();
        careTaker.addMomento(memento);


        originator.setState("Monster 2");
        originator.setState("Monster 3");
        originator.setState("Monster 4");

        memento=originator.createMemento();
        careTaker.addMomento(memento);

        originator.setState("Monster 5");

        System.out.println("Originator current state: "+originator.getState());
        System.out.println("Originator restoring to previous state....");
        memento=careTaker.getMemento(1);
        originator.setMemento(memento);

        System.out.println("Originatore current state "+originator.getState());

        memento=careTaker.getMemento(0);
        originator.setMemento(memento);

        System.out.println("Originatore current state "+originator.getState());


    }
}
