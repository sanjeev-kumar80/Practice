package OOPS.Inhertitance;

public class Box {
  

  double l;
  double w;
  double h;

    public Box() {
      System.out.println("fist come in the parent class");
      this.l=-1;
      this.w=-0;
      this.h=-1;
    }

    // cube
    Box(double side){
      this.w=side;
      this.l=side;
      this.h=side;
    }

    Box(Box old){
      this.l=l;
      this.h=h;
      this.w=w;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    void fun(){
      System.out.println("i am the parent fun");
    }

  
}
