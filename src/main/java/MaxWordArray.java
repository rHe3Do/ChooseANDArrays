import java.util.Scanner;


public class MaxWordArray {

    private static Scanner getArr = new Scanner(System.in);

    public void run (){
        do {
            String arr[] = GetArray();
            int nom = MaxElem(arr);
            System.out.println("Максимальный элемент массива:");
            System.out.println(arr[nom]);
            System.out.println("Совершить новую операцию(y) или вернуться в главное меню(n)?");
            while (!getArr.hasNext("[ynYN]")){
                System.out.println("Введите y для повтора операции n для выхода в главное меню");
                getArr.next();
            }
        } while (!(getArr.next().toLowerCase().charAt(0) == 'n'));
    }


    public static String[] GetArray(){
        System.out.println("Введите размерность массива от 1 до 1000");
        do {
            while (!getArr.hasNextInt()) {
                System.out.println("Введите целое число от 1 до 1000");
                getArr.next();
            }
        } while (!(getArr.hasNextInt()) && (getArr.nextInt()>=1000) && (getArr.nextInt()<=0));
        String[] arr = new String[getArr.nextInt()];
        System.out.println("Введите элементы массива через Enter");
        for (int i = 0; i<arr.length; i++){
            /* не разобрался, не работает
            while (!getArr.hasNext("[a-z]")){
                System.out.println("Программа подерживает только буквенный ввод");
                getArr.next();
            }
            */
            arr[i] = getArr.next();
        }
        return arr;
    }

    public static int MaxElem(String[] arr){
        int nom = 0;
        for (int i = 0; i < (arr.length - 1); i++){
            if (arr[nom].length() < arr[i+1].length()){
                nom = i;
            }
        }
        return nom;
    }
}
