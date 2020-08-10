package swingProject.task;

import java.util.Arrays;

/**
 * Сортировка массива методом пузырька
 */
public class Task {

    public static void main(String[] args) {

        int[] array = new int[100];

        int k = 0;

        //заполнение массива случайными значениями
        while (k < 100) {
            array[k] = (int) (Math.random() * 1000);
            k++;
        }

        System.out.println(Arrays.toString(array));

        //Вызываем метод и передаём в параметры массив для сортировки
        sortByBubble(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Сортировка массива в порядке возрастания
     * @param array
     */
    public static void sortByBubble(int[] array) {
        int value;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    value = array[i];
                    array[i] = array[j];
                    array[j] = value;
                }
                else
                    continue;
            }
        }
    }
}