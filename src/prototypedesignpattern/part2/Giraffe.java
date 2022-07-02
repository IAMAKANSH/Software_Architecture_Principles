package prototypedesignpattern.part2;

public class Giraffe implements Animal{

    private String name;
    private Integer age;


    public Giraffe(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Animal clone() {
        System.out.println("Creating Animal");
        Giraffe giraffe=null;
        try {
            giraffe=(Giraffe) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return giraffe;
    }
}
