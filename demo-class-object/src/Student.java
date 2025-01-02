import java.util.Arrays;

public class Student {
  private int score;
  private String name;
  private int candies;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
    this.candies = 0;
  }

  public String getName() {
    return this.name;
  }


  public int getScore() {
    return this.score;
  }

  // Question:
  // 20 candies -> distribute students according to their score
  // Rule: Every round of distribution, Above 80 score -> 2 candies; Above 60 - 79 score -> 1 candy
  public static void main(String[] args) {
    Student[] students = new Student[] {
      new Student("Student_1", 67),
      new Student("Student_2", 89),
      new Student("Student_3", 50),
      new Student("Student_4", 99),
      new Student("Student_5", 60),
      new Student("Student_6", 59)
    };

    int totalCandy = 20;
    while (totalCandy > 0) {
      boolean distributed = false;
      for (Student student : students) {
        if (student.score >= 80 && totalCandy >= 2) {
          student.candies += 2;
          totalCandy -= 2;
          distributed = true;
        } else if (student.score >= 60 && student.score < 80 && totalCandy >= 1) {
          student.candies += 1;
          totalCandy -= 1;
          distributed = true;
        }
      } if (!distributed)
      break;
    
    }
    
    for(Student student: students)
    System.out.println(student.candies);
  // Student 1: 67 score
  // Student 2: 89 score
  // Student 3: 50 score
  // Student 4: 99 score
  // Student 5: 60 score
  // Student 6: 59 score

  // 1: 1
  // 2: 3
  // 3: 0
  // 4: 2
  // 5: 1
  // 6: 0

  // Expected Output:
  // Student 1 has 4 candies
  // Student 2 has 6 candies
  // Student 3 has 0 candies
  // Student 4 has 6 candies
  // Student 5 has 4 candies
  // Student 6 has 0 candies

  // Tips: static -> candyCount (while loop)

  // Question 2:
  // Candy.class has attribute color (RED, BLUE, YELLOW)
  // Student2.class to store his own candies

  // 20 candies -> distribute students according to their score
  // Rule: Every round of distribution, Above 80 score -> RED; between 60 - 79 score -> BLUE, else YELLOW

  // Student 1: 67 score
  // Student 2: 89 score
  // Student 3: 50 score
  // Student 4: 99 score
  // Student 5: 60 score
  // Student 6: 59 score

  // Expected output: Sysout Student[] (Student should have Candy attribute)
}
}