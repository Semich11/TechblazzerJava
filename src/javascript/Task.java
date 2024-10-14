package javascript;

public class Task {

    public int[] arrayReverse(int[] array) {
        for (int innerIndex = 0; innerIndex < array.length; innerIndex++) {
            if (innerIndex == array.length / 2) break;
            int temp = array[innerIndex];
            array[innerIndex] = array[array.length - innerIndex - 1];
            array[array.length - innerIndex - 1] = temp;
        }
        return array;
    }


    public int[] pablo(int[] array) {
        for (int innerIndex = 0; innerIndex < array.length; innerIndex++) {
            System.out.println(innerIndex);
        }
        return array;
    }
}
