import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Scanner getChose = new Scanner(System.in);
        char stop = 'y';
        //char ch = '0';
        do {
            System.out.println("Выберите интересующую Вас операцию:");
            System.out.println("1 - Калькулятор; 2 - Поиск максимального элемента в массиве; 3 - замена максимального и минимального элемента в массиве местами");
            while (!getChose.hasNext("[123]")) {
                System.out.println("Введите число 1 или 2 или 3");
                getChose.next();
            }
            switch (getChose.next().charAt(0)) {
                case '1':
                    Calc kalk = new Calc();
                    kalk.run();
                    break;
                case '2':
                    MaxWordArray arr = new MaxWordArray();
                    arr.run();
                    break;
                case '3':
                    SwapMinMaxArr arrSwap = new SwapMinMaxArr();
                    arrSwap.start();
                    break;
            }
            System.out.println("Перейти к выбору новой операции(y) или  закрыть программу(n)");
            while (!getChose.hasNext("[ynYN]")) {
                System.out.println("Введите y или n");
                getChose.next();
            }
        } while(!(getChose.next().toLowerCase().charAt(0) == 'n'));
    }
}

