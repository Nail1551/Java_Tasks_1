import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*       Задача 1.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное.");
            }
*/
/*        Задача 2.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();

        int min = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Минимальное число: " + min);

 */

/*        Задача 3.
        int number = 5;
        System.out.println("Таблица умножения на " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);

        }

 */

/*        Задача 4
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum +=i;
        }
        System.out.println("Сумма всех чисел от 1 до " + num + " равна " + sum);

 */

/*        Задача 5.

        Scanner scanner = new Scanner(System.in);

    System.out.print("Введите количество чисел Фибоначчи, которые вы хотите вывести: ");
    int N = scanner.nextInt();

    if (N <= 0) {
        System.out.println("Количество чисел должно быть положительным числом.");
    } else {
        System.out.println("Первые " + N + " чисел Фибоначчи:");

        int firstNUM = 0;
        int secondNUM = 1;

        for (int i = 1; i <= N; i++) {
            System.out.print(firstNUM + " ");
            int next = firstNUM + secondNUM;
            firstNUM = secondNUM;
            secondNUM = next;
        }
        System.out.println();
    }

 */
 /*         Задача 6.

    Scanner in = new Scanner(System.in);

    System.out.print("Введите целое число: ");
    int number = in.nextInt();

    if (number <= 1) {
        System.out.println(number + " не является простым числом.");
    } else {
        boolean Prost = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                Prost = false;
                break;
            }
        }

        if (Prost) {
            System.out.println(number + " является простым числом.");
        } else {
            System.out.println(number + " не является простым числом.");
        }
    }

  */

/*    Задача№7

    Scanner in = new Scanner(System.in);

    System.out.print("Введите целое число N: ");
    int N = in.nextInt();

    if (N <= 0) {
        System.out.println("Введите положительное число.");
    } else {
        System.out.println("Числа от " + N + " до 1 в обратном порядке:");

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();


 */

/*    Задача№8


    Scanner in = new Scanner(System.in);

    System.out.print("Введите целое число A: ");
    int A = in.nextInt();
    System.out.print("Введите целое число B: ");
    int B = in.nextInt();

    int sum = 0;

    if (A > B) {
        System.out.println("A должно быть меньше или равно B.");
    } else {

        if (A % 2 != 0) {
            A++;
        }

        for (int i = A; i <= B; i += 2) {
            sum += i;
        }


        System.out.println("Сумма четных чисел от A до B: " + sum);


 */
/*   Задача№9

    Scanner in = new Scanner(System.in);

    System.out.print("Введите строку: ");
    String input = in.nextLine();

    String reversed = "";

    for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input.charAt(i);
    }

    System.out.println("Обратный порядок строки: " + reversed);

 */

        /* Задача 10.
        System.out.print("Введите целое число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int digitCount = String.valueOf(Math.abs(number)).length();

        System.out.println("Количество цифр в числе: " + digitCount);

         */

        /*Задача 11.
        System.out.print("Введите целое число: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long factorialN = 1;
        for (int i = 2; i <= n; i++) {
            factorialN *= i;
        }

        System.out.println("Факториал числа " + n + " равен: " + factorialN);

         */

        /* Задача 12.
        System.out.print("Введите целое число: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int sum = 0;
        N = Math.abs(N); // Учитываем возможный минус

        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }

        System.out.println("Сумма цифр числа: " + sum);

         */

        /* Задача 13.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = in.nextLine();


        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int length = normalized.length();

        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }

         */

        /* Задача 14

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        int max = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Максимальное число в массиве: " + max);

         */

            /*Задача 15.


        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println("Сумма всех элементов массива: " + sum);

             */

        /* Задача 16.

       System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        int plsCount = 0;
        int mnsCount = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                plsCount++;
            } else if (array[i] < 0) {
                mnsCount++;
            }
        }

        System.out.println("Количество положительных чисел: " + plsCount);
        System.out.println("Количество отрицательных чисел: " + mnsCount);

         */

        /*Задача 17

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число (A): ");
        int A = in.nextInt();
        System.out.print("Введите второе число (B): ");
        int B = in.nextInt();


        if (A > B) {
            System.out.println("A должно быть меньше или равно B.");
            return;
        }

        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

         */





        /* Задача 18



        System.out.print("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();


        int GLCount = 0;
        int SOGLCount = 0;


        String lowerCaseInput = input.toLowerCase();


        for (char ch : lowerCaseInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    GLCount++;
                } else {
                    SOGLCount++;
                }
            }
        }


        System.out.println("Количество гласных: " + GLCount);
        System.out.println("Количество согласных: " + SOGLCount);
    }


    public static boolean isVowel(char ch) {
        return "аеёиоуыэюя".indexOf(ch) != -1;

         */




        /* Задача 19

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = in.nextLine();

        String[] words = input.split("\\s+");

        System.out.println("Слова в обратном порядке:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

         */

/*        Задача 20: Число Армстронга


        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " является числом Армстронга.");
        } else {
            System.out.println(number + " не является числом Армстронга.");
        }
    }

        public static boolean isArmstrong(int number) {
            int originalNumber = number;
            int sum = 0;
            int numberOfDigits = String.valueOf(number).length();


            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numberOfDigits);
                number /= 10;
            }


            return sum == originalNumber;

 */
    }
}



