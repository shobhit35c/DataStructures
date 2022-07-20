import java.util.Iterator;

import LinkedList.Node;

/*
 * Shobhit Choudhury 
 * 
 * 
 * This is a dynamic array implementation using static arrays only
 * CREDITS to William Fiset tutorial on this, using videos from his to make this in order
 * to further my knowledge and understanding of DSA
 */
public class Array <T> implements Iterable <T> {
    private T[] arr; //Internal Static Array
    private int len = 0; //Length of array from user perspective 
    private int capacity = 0; //Length of actual dyanmic array size 
    
   
  public Array() { 
      this(16);
    }

    public Array(int capacity) {
        if(capacity < 0) throw new IllegalArgumentException("Illegal capacity" + capacity);
        this.capacity = capacity;
       
        arr = (T[]) new Object[capacity];
}

    public Iterator<T> iterator() {
        
        return null;
    } 

    public int size() { return len; }
    public boolean isEmpty() { return size()==0; }
    //Get the value from the dynamic array from a certain index
    public T get(int index){ return arr[index];}
    //Set an element from dynamic array to value, use generics to be data type independent 
    public void set(int index, T value) {arr[index] = value;}

    public void clear()  {
        for(int i = 0; i < capacity; i++) {
            arr[i] = null;
            len = 0; //Length of static array should be 0; 
        }
    }

    public void Add(T element) {
        //First check if the capacity has been reached
        if(len+1 >= capacity) {
        
        }
    }
    
}