package arrayList;

public class ArrayList {

    public boolean isEmpty() {
        if(modCount > 0) return false;
        return true;
    }

    public void add(int index, String element) {
        this.modCount++;
        elements[index] = element;
    }

    public void add(String element) {
        elements[this.modCount] = element;
        this.modCount++;
    }

    public String get(int index) {
        return this.elements[index];
    }

    public int size() {
        return modCount;
    }

    public String set(int index, String element) {
        if(index < 1 || index > this.modCount)
            throw new IndexOutOfBoundsException();
        String prevElement = this.elements[index-1];
        this.elements[index-1] = element;
        return prevElement;
    }

    private String[] elements;
    private int modCount;
    public ArrayList() {
        elements = new String[10];
    }


}
