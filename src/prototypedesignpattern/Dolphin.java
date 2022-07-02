package prototypedesignpattern;

public class Dolphin implements Prototype{

    private String name;
    private Integer age;

    public Dolphin(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Dolphin(name,age);
    }
}
