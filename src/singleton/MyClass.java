package singleton;

public class MyClass {

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private static MyClass uniqueInstance=new MyClass();

    private  MyClass() {

    }
        //adding synchronized make our class thread safe
    //syncronized
       public static MyClass getInstance(){
//            if (uniqueInstance==null) {
//                uniqueInstance=new MyClass();
//            }
            return uniqueInstance;
       }

}
