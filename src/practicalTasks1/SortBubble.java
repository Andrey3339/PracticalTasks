package practicalTasks1;

public class SortBubble {
    public static void main(String[] args) {
        int n = 50;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            //System.out.print(arr[i] + " ");
        }
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sort(int[] noSort) {

        for (int i = 0; i < noSort.length; i++) {
            for (int j = 0; j < noSort.length - i - 1; j++) {

                if (noSort[j] > noSort[j + 1]) {
                    int temp = noSort[j];
                    noSort[j] = noSort[j + 1];
                    noSort[j + 1] = temp;
                }

            }
        }

    }

}
