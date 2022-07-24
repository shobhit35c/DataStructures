import java.util.Iterator;

/*
 * Shobhit Choudhury 
 * 
 * 
 * This is a dynamic array implementation using static arrays only
 * CREDITS to William Fiset tutorial on this, using videos from his to make this in order
 * to further my knowledge and understanding of DSA
 */
public class Array<T> implements Iterable<T> {
    private T[] arr; // Internal Static Array
    private int len = 0; // Length of array from user perspective
    private int capacity = 0; // Length of actual dyanmic array size

    public Array() {
        this(16);
    }

    public Array(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Illegal capacity" + capacity);
        this.capacity = capacity;

        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // Get the value from the dynamic array from a certain index
    public T get(int index) {
        return arr[index];
    }

    // Set an element from dynamic array to value, use generics to be data type
    // independent
    public void set(int index, T value) {
        arr[index] = value;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            arr[i] = null;
            len = 0; // Length of static array should be 0;
        }
    }

    public void Add(T element) {
        // First check if the capacity has been reached
        if (len + 1 >= capacity) {
            // DOuble the array size
            if (capacity == 0) {
                capacity = 1; // Since we are just adding one element, and
                // max capacity hasn't been reached yet
            } else {
                capacity *= 2; // double the array

            }
            T[] new_arr = (T[]) new Object[capacity];
            for (int i = 0; i < len; i++) {
                new_arr[i] = arr[i];
            }
            arr = new_arr;

        }
        arr[len++] = element;
    }

    // Remove a value at a certain position in the array
    public T removeAt(int index) {
        // Check if the index is valid for removal
        if (index >= len && index < 0)
            throw new IndexOutOfBoundsException();
        T data = arr[index];
        T[] new_arr = (T[]) new Object[len - 1];
        for (int i = 0, j = 0; i < len; i++, j++) {
            if (i == index)
                j--;
            else
                new_arr[j] = arr[i];
            arr = new_arr;
            capacity = --len;
        }

        return data;

    }

    public boolean remove(Object obj) {
        for (int i = 0; i < len; i++) {
            if (arr[i].equals(obj)) {

                removeAt(i);
                return true;
            }
        }
        return false;

    }

    public int indexOf(Object index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(index)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) == -1;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            public boolean hasNext() {
                return index < len;
            }

            public T next() {
                return arr[index++];
            }
        };

    }
}