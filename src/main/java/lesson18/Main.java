package lesson18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные:");
        String[] data = scanner.nextLine().split("");
        int arg1 = Integer.parseInt(data[0]);
        String op = data[1];
        int arg2 = Integer.parseInt(data[2]);

        Calculator calculator = new Calculator();
        int result = calculator.calculate(arg1, op, arg2);

        System.out.println(result);
    }
}
