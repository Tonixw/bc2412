public class Test1 {
   public static void main(String[] args) {
    // Compile time
    // Run time -> p1.getAge()

    Person p1 = null; //
    p1.getAges(); // Compile Error -> p1 come from Person.class and this class has NO getK() method

    p1.getAge();
    // Comp[ile OK -> p1 come from Person.class, and this class has getAge() method
    // Runtime Error -> beccause p1 object reference finally cannot point to an object.
   }
  
}
