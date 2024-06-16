import java.util.Iterator;

// Bag class accepts generic data type;
public class Bag<T> implements Iterable<T>{
  private Node<T> first;
  private int size = 0;

  // Helper class to replicate linked list pointing to next node
  private static class Node<T> {
    private T data;
    private Node<T> next;
  }

  // Instantiate the class with null node and size of 0
  public Bag () {
    first = null;
    size = 0;
  }

  // Add new item
  public void add(T item) {
    Node<T> prevFirst = first; // temp storage
    first = new Node<T>(); // Create new node
    first.data = item; // Set new data
    first.next = prevFirst; // Point to the old node
    size++;
  }

  // Remove item
  public void remove (T item) {
    // Do nothing if list is empty;
    if(first == null) {
      return;
    }

    // If item is first node remove
    if(first.data.equals(item)) {
      first = first.next;
      size--;
    }


    Node<T> current = first;
    
    while(current.data != null && !current.next.data.equals(item)) {
      current = current.next;
    }

    // if item is found remove.
    if (current.next != null) {
      current.next = current.next.next;
      size--;
    }
  }

  // Return true if found
  public boolean contains(T item) {
    // iterate over data looking for item
    for(T data: this) {
      if (data == item) {
        return true;
      }
    }
    return false;
  }
  
  // Count instances of items
  public int count(T item) {
    int count = 0;
    for(T data: this) {
      if(data.equals(item)) {
        count++;
      }
    }
    return count;
  }

  // Return current size
  public int getCurrentSize() {
    return this.size;
  }

  // Implement iterator for Bag
  public Iterator<T> iterator() {
    return new LinkedIterator(first);
  }

  // Method to iterate over linked nodes
  private class LinkedIterator implements Iterator<T> {
    private Node<T> current;
    public LinkedIterator (Node<T> first) {
      current = first;
    }
    // Validate current item is not null
    public boolean hasNext() {
      return current != null;
    }

    // Return next node 
    public T next() {
      T data = current.data;
      current = current.next;
      return data;
    }
  }


}
