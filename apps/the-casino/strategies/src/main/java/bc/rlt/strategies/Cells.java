package bc.rlt.strategies;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Cells implements Serializable {

    private final List<Cell> cells = new ArrayList<>();

    public List<Cell> getCells() {
        return cells;
    }

    public int size() {
        return cells.size();
    }

    public boolean isEmpty() {
        return cells.isEmpty();
    }

    public Iterator<Cell> iterator() {
        return cells.iterator();
    }

    public <T> T[] toArray(T[] a) {
        return cells.toArray(a);
    }

    public boolean add(Cell e) {
        return cells.add(e);
    }

    public void clear() {
        cells.clear();
    }

    public int hashCode() {
        return cells.hashCode();
    }

    public Cell fetch(int index) {
        return cells.get(index);
    }

    public Cell fetchLast() {
        return cells.get(cells.size() - 1);
    }

    public Cell fetchFirst() {
        return cells.get(0);
    }

    public Stream<Cell> stream() {
        return cells.stream();
    }

    public void forEach(Consumer<? super Cell> action) {
        cells.forEach(action);
    }

}
