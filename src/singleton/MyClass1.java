package singleton;

public class MyClass1 {

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private volatile static MyClass1 uniqueInstance;

    private MyClass1() {

    }
        //adding synchronized make our class thread safe
    //syncronized
       public static MyClass1 getInstance(){
            if (uniqueInstance==null) {
                synchronized (MyClass1.class)
                {
                    if(uniqueInstance==null)
                    {
                        uniqueInstance=new MyClass1();
                    }

                }
            }
            return uniqueInstance;
       }

}
