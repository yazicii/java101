package Java101.myList;

import java.util.Arrays;

public class MyList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size;
    private int capacity;


    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (capacity == size) {
            resizeArray();
        }
        array[size] = data;
        size++;
    }

    private void resizeArray() {
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];
        array = newArray;

    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return null;
        }
    }

    public T remove(int index) {
        if (index >= 0 && index < size) {
            T removedValue = array[index];
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
            return removedValue;
        } else {
            return null;
        }

    }

    public T set(int index, T data) {
        if (index >= 0 && index < size) {
            T oldValue = array[index];
            array[index] = data;
            return oldValue;
        } else {
            return data;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;

    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T[] toArray(){
        return Arrays.copyOf(array,size);
    }

    public void clear(){
        size = 0;
        array=(T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList<T> sublist(int start, int finish){
        if (start < 0 || finish >= size || start > finish){
            throw new IllegalArgumentException("Geçersiz indeks aralığı");
        }

        MyList<T> sublist = new MyList<>();
        for (int i = start; i <= finish; i++) {
            sublist.add(array[i]);
        }
        return sublist;
    }

    public boolean contains(T data){
        for (int i = 0; i < size; i++){
            if (array[i].equals(data)){
                return true;
            }
        }
        return false;
    }
}

