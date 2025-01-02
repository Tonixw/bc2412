public class Teacher {
  private Candy2[] candies; // address
  private Student2[] students2; // address


  public Teacher(Candy2[] candies, Student2[] student2) {
    this.candies = candies;
    this.students2 = students2;
  }

  public static boolean shouldDistribute(int score, char color) {
    return score >= 80 && color == 'R' 
        || score >= 60 && score < 80 && color == 'B'
        || score < 60 && color == 'Y';
  }

  // Teacher, Candy2, STudent2

  public void distribute() {
    int pos = 0;
    //for (Candy2 candy : this.candies) {
    while (true) {
      for (Student2 student : this.students2) {
        System.out.println("sid=" + student.getId());
        if (shouldDistribute(student.getScore(), this.candies[pos].getColor())) {
          student.receiveCandy(this.candies[pos]); // student candy bag + 1
          this.candies[pos] = null; // teacher's candy bag - 1
          if (pos++ >= this.candies.length)
          return;
        }
      }
    }
    //}
  }


  public static void main(String[] args) {
    Candy2[] candies = new Candy2[] {new Candy2('R'), new Candy2('B'),
        new Candy2('Y'), new Candy2('R'), new Candy2('B'), new Candy2('Y'),
        new Candy2('R'), new Candy2('B'), new Candy2('Y'), new Candy2('R'),
        new Candy2('B'), new Candy2('Y'), new Candy2('R'), new Candy2('B'),
        new Candy2('Y'), new Candy2('R'), new Candy2('B'), new Candy2('Y'),
        new Candy2('R'), new Candy2('B')};
    System.out.println(candies.length);
    Student2[] students2 = new Student2[] {new Student2(1L, 67),
        new Student2(2L, 89), new Student2(3L, 50),
        new Student2(4L, 99), new Student2(5L,60),
        new Student2(6L,59)};


    Teacher t1 = new Teacher(candies, students2);
    //t1.distribute();
    // t1.distribute() <-> s1.setCandies()

    for (Student2 student : students2) {
      //System.out.println("Student " + student.getId() + "-"
      //  + Arrays.toString(student.getCandies()));
    }
  }
}
