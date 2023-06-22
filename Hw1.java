package Lesson2.lesson2.src.main.java.ru.geekbrains.lesson2.homework;
import java.util.Random;
import java.util.Scanner;

public class Hw1 {

    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = prepareArray(n);
        printArray(arr);
        heapSort(arr);
        System.out.println("HeapSort");
        printArray(arr);
    }

    /**
     * @apiNote пирамидальная сортировка
     * @param arr массив данных
     */
    private static void heapSort(int[] arr) {
        for (int i = arr.length/2 - 1; i >= 0 ; i--) {
            heapify(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    /**
     * @apiNote преобразование массива в кучу
     * @param arr массив
     * @param rootIndex корневой индекс
     * @param heapSize размер кучи
     */
    private static void heapify(int[] arr, int rootIndex, int heapSize) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if(leftChild < heapSize && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        if(rightChild < heapSize && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if(rootIndex != largest) {
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, heapSize);
        }

    }

    /**
     * @apiNote отображение массива
     * @param arr массив
     */
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    /**
     * @apiNote Создание массива рандомных чисел до 100
     * @param length размер массива
     * @return массив чисел
     */
    public static int[] prepareArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}