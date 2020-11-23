package module03.lesson33_structural_patterns.decorator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;


/**
 * Используя декоратор, можно из итератора сделать круговой итератор.
 *
 */
public class RoundIteratorExample<T> extends ArrayList<T> {
    public static void main(String[] args) {
        RoundIteratorExample<Integer> list = new RoundIteratorExample<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int count = 0;
        for (Integer i : list) {
            //1 2 3 1 2 3 1 2 3 1
            System.out.print(i + " ");
            count++;
            if (count == 10) {
                break;
            }
        }
    }

    public Iterator<T> iterator() {
        return new RoundIterator(super.iterator());
    }

    public class RoundIterator implements Iterator<T>{

        Iterator<T> iterator;

        public RoundIterator(Iterator<T> iterator) {
            this.iterator = iterator;
        }

        @Override
        public boolean hasNext() {
            return size() > 0;
        }

        @Override
        public void remove() {
            iterator.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            iterator.forEachRemaining(action);
        }

        @Override
        public T next() {
            if (!iterator.hasNext()) {
                iterator = RoundIteratorExample.super.iterator();
            }
            return iterator.next();
        }
    }
}
