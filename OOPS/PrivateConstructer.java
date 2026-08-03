package OOPS;

public class PrivateConstructer {
  
  private PrivateConstructer(){

  }

  private static PrivateConstructer instance;

  public static PrivateConstructer getInstance(){

    // check whether 1 obj only is created or not

    if(instance==null){
      instance=new PrivateConstructer();
    }

    return instance;
  }


}
