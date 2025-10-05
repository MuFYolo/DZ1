import java.util.Arrays;

public class MyArrayList<S> {
    private MyBook[] array = new MyBook[10];
    private int size = 0;

    public MyBook get(int index) {
        checkIndex(index);
        return array[index];
    }

    public void add(MyBook book) {
        increaseArray();
        array[size] = book;
        size++;
    }

    public void add(MyBook obj, int index) {
        increaseArray();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = obj;
        size++;
    }

    public void addAll(MyBook... elements) {
        for (MyBook element : elements) {
            add(element);
        }
    }

    public boolean remove(MyBook obj) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                return removeAt(i);
            }
        }
        return false;
    }

    public boolean removeAt(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - 1 - index);
        size--;
        return true;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        array = new MyBook[10];
        size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void increaseArray() {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}
