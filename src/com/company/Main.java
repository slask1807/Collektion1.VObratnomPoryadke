import java.util.*;

public class Main {

    public static class ReverseIterating<T> implements Iterable<T> {
        private final LinkedList<T> list;

        public ReverseIterating(LinkedList<T> list) {
            this.list = list;
        }

        @Override
        public Iterator<T> iterator() {
            return list.descendingIterator();
        }
    }

    public static void main(String... args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for (String s : new ReverseIterating<String>(list)) {
            System.out.println(s);
        }
    }
}