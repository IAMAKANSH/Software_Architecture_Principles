package prototypedesignpattern.part2;

public class Driver {

    public static void main(String[] args) {

        Giraffe gg=new Giraffe("James",35);
        System.out.println("Animal 1: "+gg);

        Giraffe gg1= (Giraffe) gg.clone();
        System.out.println("Animal 2: "+gg1);

        System.out.println(System.identityHashCode(gg));
        System.out.println(System.identityHashCode(gg1));



    }
}
