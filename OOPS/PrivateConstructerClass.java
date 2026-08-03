package OOPS;

public class PrivateConstructerClass {

  public static void main(String[] args) {
    PrivateConstructer obj=PrivateConstructer.getInstance();
    PrivateConstructer obj1=PrivateConstructer.getInstance();
    PrivateConstructer obj2=PrivateConstructer.getInstance();
    // all 3 ref variable are pointing to just one object
    
  }
  
}
