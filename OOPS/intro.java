package OOPS;

public class intro {
  public static void main(String[] args) {
    
    Student sam=new Student();

    System.out.println(sam.rollno[0]);
  }
}

class Student{
  int [] rollno=new int[5];

  float [] marks=new float[5];

  String [] name=new String[5];
}
