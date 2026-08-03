package OOPS.Inhertitance;

public class BoxWeight extends Box{

  double weight;

    public BoxWeight() {
      // for the constructor first run the the parent constructor
      System.out.println("first come in the child class");
      this.weight=-10;
      // this  is override the w value here
    }

     BoxWeight(double w, double l, double weight, double h) {
        super(l, w, h);//call the parent class constructor
        // used to initialize the values parent class
        this.weight = weight;
    }


    

    void fun(){
      System.out.println("I am the child fun");
      // hence this is override the parent fun here
    }

  
  
}
