public class MyHashSet {

    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private int size = 0;
    private Entry[] array = new Entry[INITIAL_CAPACITY];

    public boolean add(Student student) {
        if (size >= (array.length * LOAD_FACTOR)) {
            increaseArray();
        }
        boolean added = add(student, array);
        if (added) {
            size++;
        }
        return added;
    }

    private boolean add(Student student, Entry[] dst) {
        int position = getElementPosition(student, dst.length);
        if (dst[position] == null) {
            Entry entry = new Entry(student, null);
            dst[position] = entry;
            return true;
        } else {
            Entry existedElement = dst[position];
            while (true) {
                if (existedElement.value.equals(student)) {
                    return false;
                } else if (existedElement.next == null) {
                    existedElement.next = new Entry(student, null);
                    return true;
                } else {
                    existedElement = existedElement.next;
                }
            }
        }
    }

    public boolean remove(Student student) {
        int position = getElementPosition(student, array.length);
        if (array[position] == null) {
            return false;
        }
        Entry secondLast = array[position];
        Entry last = secondLast.next;
        if (secondLast.value.equals(student)) {
            array[position] = last;
            size--;
            return true;
        }
        while (last != null) {
            if (last.value.equals(student)) {
                secondLast.next = last.next;
                size--;
                return true;
            } else {
                secondLast = last;
                last = last.next;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void clear() {
        array = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    private void increaseArray() {
        Entry[] newArray = new Entry[array.length * 2];
        for (Entry entry : array) {
            Entry existedElement = entry;
            while (existedElement != null) {
                add(existedElement.value, newArray);
                existedElement = existedElement.next;
            }
        }
        array = newArray;
    }

    private int getElementPosition(Student student, int arrayLength) {
        return Math.abs(student.hashCode() % arrayLength);
    }

    private static class Entry {
        private Student value;
        private Entry next;

        public Entry(Student value, Entry next) {
            this.value = value;
            this.next = next;
        }
    }
}
