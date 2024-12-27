import java.lang.reflect.Array;

public class Person {// blueprint - define a Person
    // attributes
    private String name;
    private int age;
    private String emailAddress;
    private char gender; // F/M

    // constructor (Not Method)
    // constructor is to create object
    public Person(String name, int age, String email, boolean isMale) {
        this.name = name;
        this.age = age;
        this.emailAddress = email;
        this.gender = gender;
    }

    public boolean isMale() {
        return this.gender == 'M' ? true : false;
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
    // void -> return type (return nothing)
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jimmy", 5, jimmy@gmail.com, 'M')
        System.out.println(p1.isMale());
        System.out.println(p1.getName().length());
        System.out.println(p1.getNameLength());
        System.out.println(p1Eladerly());
        System.out.println(isElderly());
    }

}

