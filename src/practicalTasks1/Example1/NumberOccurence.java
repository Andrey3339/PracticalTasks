package practicalTasks1.Example1;

import java.util.Arrays;

public class NumberOccurence {
    public static void main(String[] args) {
        int n = 50;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        int a = 2;
        int arrVozoutA[] = numOcc(arr, a);
        System.out.println("\nУдаляем из массива элемент " + a + ": ");
        for (int i = 0; i < arrVozoutA.length; i++) {
            System.out.print(arrVozoutA[i] + " ");
        }
    }
    public static int[] numOcc(int arrRand[], int a)
    {
        int offset = 0;
        for (int i = 0; i < arrRand.length; i++) {
            if(arrRand[i] == a)
                offset ++;
            else {
                arrRand[i - offset] = arrRand[i];
            }
        }
        // статический метод copyOf класса Arrays копирует массив arrRand
        // в новый массив, длинна которого короче на offset
        return Arrays.copyOf(arrRand, arrRand.length - offset);
    }
}
