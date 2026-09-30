import java.util.HashMap;

import LRU.Implementation.LRUCache;

public class doublyLinkedList {

  class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  HashMap<Integer, Node> map;
  int capacity;
  Node head;
  Node tail;

  public LRUCache(int capacity){
    this.capacity=capacity;
    head=new Node(0,0);
    tail=new Node(0,0);

    head.next=tail;
    tail.prev=head;
  }

  void addNode(Node node) {
    node.prev = tail.prev;
    node.next = tail;

    tail.prev.next = node;
    tail.prev = node;
  }

  void removeNode(Node node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }

  public int get(int key) {
    if (!map.containsKey(key)) {
      return -1;
    }

    Node node = map.get(key);
    removeNode(node);
    addNode(node);
    return node.value;
  }

  public int put(int key, int value) {
    if (map.containsKey(key)) {
      Node node = map.get(key);
      node.value = value;

      removeNode(node);
      addNode(node);
      return node.value;
    }

    Node node = new Node(key, value);
    map.put(key, node);

    addNode(node);

    if (map.size() > capacity) {
      Node lru = head.next;
      removeNode(lru);

    }

  }

  public static void main(String[] args) {

  }
}
