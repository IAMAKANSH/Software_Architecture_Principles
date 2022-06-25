package builderdesignpattern.part2;

public class DefaultPerson implements  Person{

    //Required Parameter
    private final String firstName;
    private final String lastName;

    //optional parameter
    protected String phoneNumber;
    protected String address;
    protected Integer age;

    public DefaultPerson(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected DefaultPerson(Builder builder) {
        this(builder.getFirstName(),builder.getLastName());
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.age = builder.age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "DefaultPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    //inner class
    static class Builder extends DefaultPerson{

        public Builder(String firstName, String lastName) {
            super(firstName, lastName);
        }

        public Builder phone(String phoneNumber)
        {
            this.phoneNumber=phoneNumber;
            return this;
        }

        public Builder address(String address)
        {
            this.address=address;
            return this;
        }
        public Builder age(Integer age)
        {
            this.age=age;
            return this;
        }

        public Person build()
        {
            return new DefaultPerson(this);
        }
    }
}
