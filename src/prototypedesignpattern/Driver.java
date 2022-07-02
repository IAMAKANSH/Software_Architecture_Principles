package prototypedesignpattern;

public class Driver {

    public static void main(String[] args) {

        Person akansh=new Person("Akansh",26);
        System.out.println("Person 1: "+akansh);

        Person nina= (Person) akansh.clone();
        nina.setAge(35);
        nina.setName("Nina");
        System.out.println("Person 2: "+nina);


        Dolphin jerry=new Dolphin("Jerry",78);
        System.out.println("Dolphin 1: "+jerry);

        Dolphin sam= (Dolphin) jerry.clone();
        System.out.println("Dolphin 2: "+sam);
    }
}
