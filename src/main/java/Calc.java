import java.util.Scanner;
/**
 * Created by user on 29.11.2017.
 * Класс Calc - основной класс программы Калькулятор, реализует математические операции с введенными пользователем
 * числами, имеет 3 метода помимо main(GetNumber, GetOper, MathOper). Запуск позволяет пользователю ввести
 * последовательно 2 числа и одну из операций(* или / или + или -), после чего производит выбранную математическую
 * операцию с ранее введенными числами и выводит результат. После вывода результата пользователю предлагается
 * завершить работу или произвести новую операцию с новыми числами посредством ввода "y" - для новой операции
 * или "n" - для выхода.
 */
public class Calc {

    public void run(){
        double num1, num2, result;
        char oper, chose;
        Scanner getc = new Scanner(System.in);
        do {
            Calc c = new Calc();
            num1 = c.GetNumber();
            num2 = c.GetNumber();
            oper = c.GetOper();
            result = c.MathOper(num1, num2, oper);
            System.out.format("Результат операции: %.4f%n", result);
            System.out.println("Хотите провести ещё одну операцию(y-да; n-нет)");
            while (!getc.hasNext("[ynYN]")) {
                System.out.println("Ввод некорректен, введите 'y' или 'n'");
                getc.next();
            }
            chose = getc.next().toLowerCase().charAt(0);
        } while (!(chose =='n'));
    }

    /**
     * GetNumber - метод получения числа типа double при вводе пользователем в консоли, в методе установлена
     * проверка на получения только числа типа double, возвращает число типа double.
     * @return - возвращает введённое пользователем число;
     */
    public double GetNumber(){
        Scanner get = new Scanner(System.in);
        System.out.println("Введите число");
        do {
            while (!get.hasNextDouble()||!get.hasNext()) {
                System.out.println("Ввод некорректен, повторите ввод");
                get.next();
            }
        } while (!get.hasNextDouble());
        return get.nextDouble();
    }

    /**
     * GetOper - метод получения математической операции при вводе пользователем в консоли, в методе установлена
     * проверка на получения только операций / или * или + или -, возвращает значение введенной пользователем операции
     * в char.
     * @return - возвращает введённую пользователем операцию;
     */
    public char GetOper(){
        Scanner geto = new Scanner(System.in);
        System.out.println("Введите операцию(поддерживаются '+' '-' '*' '/')");
        while (!geto.hasNext("[-+*/]")){
            System.out.println("Вы ввели неподдерживаемую операцию, повторите ввод");
            geto.next();
        }
        return geto.next().charAt(0);
    }

    /**
     *
     * MathOper - метод для "проведения" выбранной пользователем операции. На вход подаётся 2 числа типа double и
     * "знак" выбранной пользователем операции (/ или * или + или -), на выходе - результат операции в переменной типа
     * double.
     * @param ch1 - первое число для операции;
     * @param ch2 - второе число для операции;
     * @param op - математическая операция, введенная пользователем;
     * @return - возвращает результат математической операции над числами;
     */
    public double MathOper(double ch1, double ch2, char op) {
        double rez = 0;
        switch (op) {
            case '+':
                rez = ch1 + ch2;
                break;
            case '-':
                rez = ch1 - ch2;
                break;
            case '*':
                rez = ch1 * ch2;
                break;
            case '/':
                rez = ch1 / ch2;
                break;
        }
        return rez;
    }
}
