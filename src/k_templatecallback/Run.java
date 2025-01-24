package k_templatecallback;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        TimeChecker timer = new TimeChecker();
        timer.measure(new Measurable() {
            @Override
            public void measure() {
                int[] arr = createIntArray(100000);
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length - 1; j++) {
                        if(arr[j] > arr[j+1]){
                            swap(arr, j, j+1);
                        }
                    }
                }
            }
        });
    }

    public static int[] createIntArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
