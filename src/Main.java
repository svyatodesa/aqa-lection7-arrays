import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        averageArrey(num);
        minArrey(num);
        maxArrey(num);
        rotatingArrey(num);
        checkArrey(num);
    }

    //Створіть метод для обчислення середнього значення елементів в масиві чисел
    public static double averageArrey(int[] arr) {
        double avarage = Arrays.stream(arr).average().getAsDouble();
        System.out.println("середнього значення  :" + " " + avarage);
        return avarage;
    }

    //Реалізуйте функціонал для знаходження максимального і мінімального значення у масиві.
    public static int minArrey(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("мінімальне значення : " + " " + min);
        return min;
    }

    public static int maxArrey(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("максимальне значення : " + " " + max);
        return max;
    }

    //Напишіть метод для виведення елементів масиву в зворотньому порядку.
    public static int[] rotatingArrey(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    //Створіть програму, яка перевіряє, чи є задане число присутнім у введеному користувачем масиві.
    public static boolean checkArrey(int[]arr){
        System.out.println("введіть число від 1 до 9");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int check : arr){
            if (check == n){
                System.out.println("є таке значення масіві");
                return true;
            }

        }
        System.out.println("немає такого значення");
        return false;
    }

}
