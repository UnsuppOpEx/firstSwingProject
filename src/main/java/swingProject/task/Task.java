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
     *
     * @param array
     */
    public static void sortByBubble(int[] array) {
        int value;

        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array.length; i++) {
                if (array[array.length - i] < array[array.length - i - 1]) {
                    value = array[array.length - i];
                    array[array.length - i] = array[array.length - i - 1];
                    array[array.length - i - 1] = value;
                }
                else
                    continue;
            }
        }
    }
}