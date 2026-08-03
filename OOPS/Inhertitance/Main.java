package OOPS.Inhertitance;

public class Main {
  
  public static void main(String[] args) {
    // Box box1=new Box(4.6,7.9,9.9);
    // Box box2= new Box(box1);
    // System.out.println(box1.l+ " "+ box1.w + " " + box1.h + " ");

    BoxWeight box3=new BoxWeight();
    BoxWeight box4= new BoxWeight(4.0,5.0,6.0,7.0);

    System.out.println(box3.h + " " + box3.w);
    box3.fun();;


    Box box5=new BoxWeight(2,3,4,8);
    System.out.println(box5.w);

    // there are many variables in both parent and child classes
    // you are given to variables that are in the ref type i.e. Boxweight
    // hence , you should have access to weight variable
    // this also means that the ones you are trying to access should be iitialised 
    // but here when the obj itself is of type parent class how will you call the construtor
    // this is the why error

    // BoxWeight box6= new Box(2,3,5);//error error


  }
}
