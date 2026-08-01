package OOPS;

public class intro {
  public static void main(String[] args) {
    
    Student sam=new Student();

    System.out.println(sam.name);
    System.out.println(sam.rno);
    System.out.println(sam.marks);
  }
}

class Student{
  int  rno ;

  float marks ;

  String name;

    Student() {
      rno=13;
      marks=20.5f;
      name="Sam Rajput";
    }

}
