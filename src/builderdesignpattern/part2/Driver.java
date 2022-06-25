package builderdesignpattern.part2;

public class Driver {


    public static void main(String[] args) {

        Person akansh=new DefaultPerson.Builder("Akansh","Srivastava")
                .phone("8218152572")
                .address("583/B Baghambari PrayagRaj")
                .age(26)
                .build();

        System.out.println(akansh);
    }
}
