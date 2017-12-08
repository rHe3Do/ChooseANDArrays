import java.util.Scanner;
import java.util.Random;

public class SwapMinMaxArr {

    private static Scanner getArr = new Scanner(System.in);
    //private static int[] arr = new int[20];

    public static void main(String[] args){
        int[] arr = GetArray();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
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
            }
            */
        return arr;
    }

    public String[] MinMaxSwap(String[] arr){
        int minplus, maxminus, buf;
        for (int i = 0; i < arr.length; i++){


        }
        return arr;
    }
}
