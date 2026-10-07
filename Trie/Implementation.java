package Trie;

public class Implementation {

  public static class Node{

    Node [] children;
    boolean eow;

    public Node(){

      children=new Node[26];

      for(int i=0;i<26;i++){

          children[i]=null;

      }

      eow=false;

    }

  }
  // made the root node
  static  Node root=new Node();

  public static void insert(String word){
    Node curr=root;

    for(int i=0;i<word.length();i++){

      int idx=(int)(word.charAt(i)-'a');

      if(curr.children[idx]==null){
          curr.children[idx]=new Node();
      }

      if(i==word.length()-1){
        curr.children[idx].eow=true;
      }

      curr=curr.children[idx];
    }

  }

  public static boolean search(String word){
    Node curr=root;
    for(int i=0;i<word.length();i++){

      int idx=(int )(word.charAt(i)-'a');

      if(curr.children[idx]==null){
        return false;
      }
      if(i==word.length()-1 && curr.children[idx].eow==false){
        return false;
      }
      curr=curr.children[idx];
    }
    return  true;
  }

  public static void main(String[] args) {
    String [] str={"a","the","their","those"};

    for(int i=0;i<str.length;i++){
      insert(str[i]);
    }
    System.out.println(search("ab"));


  }
}
