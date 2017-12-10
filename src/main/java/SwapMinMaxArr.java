import java.util.Scanner;
import java.util.Random;

public class SwapMinMaxArr {

    private static Scanner getArr = new Scanner(System.in);
    //private static int[] arr = new int[20];

    public void start(){
        int[] arr = GetArray();
        System.out.print("Изначальный массив: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int[] arrch = MinMaxSwap(arr);
        System.out.println();
        System.out.print("Измененный массив: ");
        for (int i = 0; i < arrch.length; i++){
            System.out.print(arrch[i] + " ");
        }
    }

    public static int[] GetArray(){
        int[] arr = new int[20];
        System.out.println("Выберите ручной ввод элементов(m) или автоматический(r)");
        while (!(getArr.hasNext("[rmRM]"))) {
            System.out.println("Введите 'r' для автоматического ввода или 'm' для ручного");
            getArr.next();
        }
        switch (getArr.next().toLowerCase().charAt(0)) {
            case 'r':
                for (int i = 0; i < arr.length; i++) {
                    Random rnd = new Random();
                    arr[i] = -10 + rnd.nextInt(10 + 10);
                }
                break;
            /* пользовательский ввод массива опционален
            case 'm':
                System.out.println("Введите элементы массива через Enter(целые числа от -10 до 10)");
                for (int i = 0; i < arr.length; i++) {
                    while (!getArr.hasNextInt()) {
                        System.out.println("Введите целое число");
                        getArr.next();
                    }
                    /* не работает проверка на ввод только целых чисел в диапазоне [-10;10]
                    while (!(getArr.hasNextInt()) && (getArr.nextInt() < -10) && (getArr.nextInt() > 10)){
                        System.out.println("Введите целое число от -10 до 10");
                        getArr.next();
                    }

                    arr[i] = getArr.nextInt();
                }
                break;
            */
        }
        return arr;
    }

    public static int[] MinMaxSwap(int[] arr){
            int min = -1;
            int max = -1;
            for (int i = 1; i < arr.length - 1; i++) {
                if ((arr[i] < 0) && (max == -1)){
                    max = i;
                }
                else if ((arr[i] < 0) && (arr[i] > arr[max])){
                    max = i;
                }
                else if ((arr[i] > 0) && (min == -1)){
                    min = i;
                }
                else if ((arr[i] > 0) && (arr[i] < arr[min])){
                    min = i;
                }
            }
            System.out.print(max + ": " + arr[max]);
            System.out.print(min + ": " + arr[min]);
            int buf = arr[min];
            arr[min] = arr[max];
            arr[max] = buf;
            return arr;
    }
}
