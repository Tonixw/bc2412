import java.lang.reflect.Array;

public class Person {// blueprint - define a Person
    // attributes
    private String name;
    private int age;
    private String emailAddress;

    // constructor (Not Method)
    // constructor is to create object
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.emailAddress = email;
    }

    // getter (instance Method)
    // instance Method is able to return self value
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.emailAddress;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}

