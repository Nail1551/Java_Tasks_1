import java.util.Scanner;
import java.time.format.DateTimeParseException;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    // 1. Функция для нахождения максимума
    public static int FindMax (int a, int b) {
        if (a == b){
            throw  new IllegalArgumentException("Числа равные");
        }
        return Math.max(a,b);
    }
    // 2. Калькулятор деления
    public static double Division(double num ,double denum){
        if (denum == 0){
            throw new ArithmeticException("Делить на 0 грех");
        }
        return num/denum;
    }
    // 3. Конвертер строк в числа
    public static int Converter(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Строка не может быть конвертирована");
        }
    }
    //4. Проверка возраста
    public static int AgeCheck(int a){
        if (a>150 || a<0){
            throw new IllegalArgumentException("Не может быть такого");
        }
        return a;
    }
    //5. Нахождение корня
    public static double SQRT (int num){
       if (num<0){
           throw new IllegalArgumentException("Число не может быть меньше 0");
       }
       return Math.sqrt(num);
    }
    //6. Факториал
    public static int Factorial(int n){
        if (n<0){
            throw new IllegalArgumentException("Число не может быть меньше 0");
        }
        int sum = 1;
        for (int i=1; i<n; i++){
            sum*=i;
        }
        return sum;
    }
    //7. Проверка массива на нули
    public static boolean CheckNull(int[] array){
        for (int i = 0; i< array.length; i++){
            if (array[i]==0){
                throw new IllegalArgumentException("В массиве есть 0");
            }
        }
        return true;
    }
    //8. Калькулятор возведения в степень
    public static double Expon(double num,double exp){
        if(exp < 0){
            throw new IllegalArgumentException("Степень не может быть отрицательной");
        }
        return Math.pow(num, exp);
    }
    //9. Обрезка строки
    public static String CutCut(String str, int n){
        if (n > str.length()){
            throw new IllegalArgumentException("Число обрезки больше чем длинна строки");
        }
        return str.substring(0,n);
    }
    //10. Поиск элемента в массиве
    public static int Search(int[] array,int element){
        for (int i = 0; i< array.length;i++){
            if (array[i]== element){
                return i;
            }
        }
        throw new IllegalArgumentException("Элемента нету в массиве");
    }
    //11. Конвертация в двоичную систему
    public static String Concerter2ich(int n){
        if (n<0){
            throw new IllegalArgumentException("Отрицательные числа нельзя перевести");
        }
        return Integer.toBinaryString(n);
    }
    // 12. Проверка делимости
        public static boolean isDivisible(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Недопустимо деление на ноль.");
            }
            return a % b == 0;
        }
    // 13. Чтение элемента списка
    public static <T> T getElementByIndex(List<T> list, int index) {
        if (index < 0 || index >+ list.size()) throw new IndexOutOfBoundsException("Индекс выходит за границы массива.");
        return list.get(index);
    }
    // 14. Парольная проверка
    public static void checkPasswordStrength(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком слабый :( .");
        }
        System.out.println("Пароль  сильный :) ");
    }

    // 15. Проверка даты
    public static void checkDate(String date) {
        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new DateTimeParseException("Некорректная дата", date, 0);
        }
        System.out.println("Дата верна.");
    }

    // 16. Конкатенация строк
    public static String Konkatenation(String str1, String str2) {
        if (str1 == null || str2 == null) throw new NullPointerException("Конкатенация строк невозможна");
        return str1 + str2;
    }
    // 17. Остаток от деления
    public static double OstDiv( double numerator,double denominator) {
        if (denominator == 0) throw new ArithmeticException("Делитель не может быть равным нулю.");
        return numerator%denominator;
    }
    // 19. Конвертер температуры
    public static double tempConvert(double Temperature) {
        if (Temperature < -273.15) throw new IllegalArgumentException("Температура меньше абсолютного нуля");
        return Temperature * 9/5 + 32;
    }
    // 20. Проверка строки на пустоту
    public static String stringVerification(String str1, String str2) {
        if (str1 == null || str2 == null || str1 == "" || str2 == "") throw new NullPointerException("Конкатенация строк невозможна");
        return str1 + str2;
    }

}



