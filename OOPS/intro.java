package OOPS;

public class intro {
  public static void main(String[] args) {
    
    Student sam=new Student(13,23.5f,"Sam");

    Student random=new Student(sam);
    sam.fun();

    System.out.println(sam.name);
    System.out.println(sam.rno);
    System.out.println(sam.marks);


    // other (random student) print here
    System.out.println(random.name);
    System.out.println(random.rno);
    System.out.println(random.marks);
  }
}

class Student{
  int  rno ;

  float marks ;

  String name;

    void fun(){
      System.out.println("hello" + name);
    }

    Student() {
      rno=13;
      marks=20.5f;
      name="Sam Rajput";
    }

     Student(int rno, float marks, String name) {
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }

    //one constructor pass into second constructor
    Student (Student other){
      this.name=other.name;
      this.rno=other.rno;
      this.marks=other.marks;
    }

    

}
