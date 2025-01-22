package Activity2;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {
    private static final int MAX_SIZE = 100;

    public MyArrayList() {
        super();
        // assert postcondition
        assert this.size() == 0 : "Postcondition failed: size should be 0";
    }

    @Override
    public int size() {
        // assert postcondition
        int size = super.size();
        assert size <= MAX_SIZE : "Postcondition failed: size should be <= 100";
        return size;
    }

    // Insert e as a new first element to mal
    public void insertFirst(E e) {
        // assert precondition
        assert this.size() < MAX_SIZE : "Precondition failed: size should be < 100";
        // code
        this.add(0, e);
        // assert postcondition
        assert this.get(0) == e : "Postcondition failed: first element should be the inserted element";
    }

    // Insert e as a new last element
    public void insertLast(E e) {
        // assert precondition
        assert this.size() < MAX_SIZE : "Precondition failed: size should be < 100";
        // code
        this.add(e);
        // assert postcondition
        assert this.get(this.size() - 1) == e : "Postcondition failed: last element should be the inserted element";
    }

    // Delete my first element
    public void deleteFirst() {
        // assert precondition
        assert this.size() > 0 : "Precondition failed: size should be > 0";
        // code
        E removed = this.remove(0);
        // assert postcondition
        assert !this.contains(removed) : "Postcondition failed: first element should be removed";
    }

    // Delete my last element
    public void deleteLast() {
        // assert precondition
        assert this.size() > 0 : "Precondition failed: size should be > 0";
        // code
        E removed = this.remove(this.size() - 1);
        // assert postcondition
        assert !this.contains(removed) : "Postcondition failed: last element should be removed";
    }

    public void show() {
        for (E e : this) {
            System.out.println(e);
        }
    }
}