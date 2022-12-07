package practicalTasks1;

public class MaxMinAvValue {
    public static void main(String[] args) {
        // создать массив из целых чисел размером n
        int n = 100;
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            //System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Максимальное значение массива равно: " + max);

        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Минимальное значение массива равно: " + min);

        int avarage = 0;
        for(int i = 0; i < arr.length; i++) {
            avarage += arr[i];
        }
                avarage = avarage/arr.length;

        System.out.println("Среднее значение массива равно: " + avarage);

    }


}
