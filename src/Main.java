import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Напишите пожалуйста математические действия! Или напишите exit, чтобы завершить программу");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            calc(input);
        }
        scanner.close();
    }

    private static void calc(String input) {
        String[] elements = input.split(" ");
        if (elements.length != 3) {
            System.out.println("строка не является математической операцией! Или формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            return;
        }
        try {
            int num1 = Integer.parseInt(elements[0]);
            String operators = elements[1];
            int num2 = Integer.parseInt(elements[2]);
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                System.out.println("Числа должны быть от 1 до 10");
                return;
            }
            switch (operators) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("программа может выполнять только эти действия (+, -, /, *)");
            }
        } catch (NumberFormatException e) {
            System.out.println("Программа работает только с числами!");
        }
    }
}