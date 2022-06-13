package singleton;

public class Driver {

    public static void main(String[] args) {

        Person p=new Person();
        MyClass myClass=MyClass.getInstance();
        MyClass secondClass=MyClass.getInstance();
        myClass.setName("Class");
        System.out.println(myClass);
        System.out.println(secondClass);
        System.out.println("Object person: "+p);

        MyClass1 myClass11=MyClass1.getInstance();
        System.out.println(myClass11);
    }
}
