package bc.csn.history;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Queue<T> implements Iterable<T>{

    private final List<T> list;
    private final int capacity;
    
    void clear(){
        this.list.clear();;
    }

    public Queue(Integer capacity) {
        this.capacity = capacity;
        list = new ArrayList(capacity);
    }

    public int size() {
        return list.size();
    }
    
    public Boolean isEmpty() {
        return list.isEmpty();
    }

    public int capacity() {
        return this.capacity;
    }
    
    public void push(T t) {
        if(list.size() == capacity) {
            list.remove(capacity - 1);
        }
        
        Collections.reverse(list);
        list.add(t);
        Collections.reverse(list);
    }
    
    public T get(int index) {
        if(index >= capacity) {
            throw new IndexOutOfBoundsException("Queue has lower capacity then requested element's index.");
        }
        
        if(index >= list.size()) {
            throw new IndexOutOfBoundsException("Queue has lower elements number then requested element's index.");
        }
        
        return list.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

}
