package builderdesignpattern;

public class Driver {

    public static void main(String[] args) {

            User akansh=new User.UserBuilder("Akansh","Srivastava")
                        .address("583/B Baghambari Gaddi Prayagraj")
                        .age(26)
                        .phoneNumber("8218152572")
                        .build();
        System.out.println(akansh);
    }
}
