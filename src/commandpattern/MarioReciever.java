package commandpattern;

public class MarioReciever {

    private String name;

    public void jumpUp()
    {
        System.out.println(name+" Jumping Up");
    }

    public void jumpDown()
    {
        System.out.println(name+" Jumping Down");
    }

    public void jumpRight()
    {
        System.out.println(name+" Jumping Right");
    }

    public void jumpLeft()
    {
        System.out.println(name+" Jumping Left");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
