package exercise;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListExercise {

  public static String searchNameById(ArrayList<StudentA> studentAs, int id) {
    for (StudentA name : studentAs)
    if (name.getId() == id)
    return name.getName();
    return "Not Found";
  }

  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    ArrayList<Integer> int1 = new ArrayList<>();
    for (int i = 10; i <= 50; i += 10) {
      int1.add(i);
    }
    System.out.println(int1);

    int1.remove(2);
    System.out.println(int1);
    System.out.println(int1.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add(new String("Apple"));
    fruits.add(new String("Banana"));
    fruits.add(new String("Mango"));
    fruits.add(new String("Orange"));
    System.out.println(fruits);

    String wantToCheck = "Grapes";

    if (fruits.contains(wantToCheck)) {
      System.out.println("Grapes is exist in ArrayList.");
    } else {
      System.out.println("Grapes is not exist in ArrayList.");
    }

    if (!fruits.contains(wantToCheck)) {
      fruits.add(new String("Grapes"));
    }
    System.out.println(fruits);

    String wantToChange = "Peach";
    fruits.set(2, wantToChange);
    System.out.println(fruits);


    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(20);
    nums.add(10);
    nums.add(30);
    nums.add(40);
    nums.add(20);
    nums.add(50);
    System.out.println(nums);
    HashSet<Integer> nums1 = new HashSet<>(nums);
    System.out.println(nums1);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    HashSet<String> country = new HashSet<>();
    country.add(new String("USA"));
    country.add(new String("India"));
    country.add(new String("China"));
    country.add(new String("Japan"));
    System.out.println(country);
    country.add(new String("Canada"));
    country.add(new String("India"));
    System.out.println(country);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    HashSet<Double> dnum = new HashSet<>();
    dnum.add(1.1);
    dnum.add(2.2);
    dnum.add(3.3);
    dnum.add(4.4);
    dnum.add(5.5);
    System.out.println(dnum);
    System.out.println(dnum.contains(3.3));
    dnum.remove(2.2);
    System.out.println(dnum);
    System.out.println(dnum.size());

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

    HashSet<Integer> nums3 = new HashSet<>();
    for (int i = 10; i <= 40; i += 10) {
      nums3.add(i);
    }
    System.out.println(nums3);
    HashSet<Integer> nums4 = new HashSet<>();
    for (int j = 30; j <= 60; j += 10) {
      nums4.add(j);
    }
    System.out.println(nums4);
    HashSet<Integer> nums5 = new HashSet<>();
    for (Integer i : nums3) {
      for (Integer j : nums4) {
        if (i == j) {
          nums5.add(i);
        }
      }
    }
    System.out.println("The common numbers of the two set are: " + nums5);



    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    HashSet<String> name1 = new HashSet<>();
    name1.add(new String("CHERRY"));
    name1.add(new String("Steve"));
    name1.add(new String("Chloe"));
    name1.add(new String("Jenny"));
    name1.add(new String("Vicky"));
    ArrayList<String> name2 = new ArrayList<>(name1);
    System.out.println(name2);


    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    ArrayList<StudentA> studentAs = new ArrayList<>();
    studentAs.add(new StudentA("Alice", 1));
    studentAs.add(new StudentA("Bob", 2));
    studentAs.add(new StudentA("Charlie", 3));
    System.out.println(studentAs);
    studentAs.remove(1);
    System.out.println(studentAs);
    System.out.println(searchNameById(studentAs, 3));
    

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

    HashSet<StudentA> studentAs2 = new HashSet<>(studentAs);
    HashSet<StudentA> studentAs3 = new HashSet<>();
    studentAs3.add(new StudentA("Bob", 2));
    studentAs3.add(new StudentA("Charlie", 3));
    studentAs3.add(new StudentA("David", 4));

    HashSet<StudentA> studentAs4 = new HashSet<>();
    for (StudentA studentA2 : studentAs2) {
      for (StudentA studentA3 : studentAs3) {
        if (studentA2.getName() == studentA3.getName()) {
          studentAs4.add(studentA2);
        }
      }
    } System.out.println(studentAs4.toString());

  }

  public static class StudentA {
    private int id;
    private String name;

    public StudentA(String name, int id) {
      this.name = name;
      this.id = id;
    }

    public String getName() {
      return this.name;
    }

    public int getId() {
      return this.id;
    }

    public void setName() {
      this.name = name;
    }

    public void setId() {
      this.id = id;
    }

    @Override
    public String toString() {
      return this.name + " " + this.id;
    }

    // Constructor
    // getter, setter, etc.

    
  }


}
