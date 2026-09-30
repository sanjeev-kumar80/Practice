package LRU;

import java.util.Scanner;

public class Implementation {

  class LRUCache {

    int[] cache;
    int size;
    int capacity;

    LRUCache(int capacity) {
      this.capacity = capacity;
      cache = new int[capacity];
      size = 0;
    }

    int get(int key) {

      int index = -1;

      // Find key
      for (int i = 0; i < size; i++) {
        if (cache[i] == key) {
          index = i;
          break;
        }
      }

      // Key not found
      if (index == -1) {
        return -1;
      }

      // Move key to last (MRU)
      int value = cache[index];

      for (int i = index; i < size - 1; i++) {
        cache[i] = cache[i + 1];
      }

      cache[size - 1] = value;

      return value;
    }

    void put(int key) {

      // Check if key already exists
      int index = -1;

      for (int i = 0; i < size; i++) {
        if (cache[i] == key) {
          index = i;
          break;
        }
      }

      // Already exists → make it recently used
      if (index != -1) {

        int value = cache[index];

        for (int i = index; i < size - 1; i++) {
          cache[i] = cache[i + 1];
        }

        cache[size - 1] = value;

        return;
      }

      // Cache full
      if (size == capacity) {

        // Remove LRU
        for (int i = 0; i < size - 1; i++) {
          cache[i] = cache[i + 1];
        }

        size--;
      }

      // Add new item as MRU
      cache[size] = key;
      size++;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

  }
}
