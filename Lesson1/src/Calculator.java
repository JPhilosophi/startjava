import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        char operation;
        int result = 0;
        System.out.println("Введите выражение: ");
        Scanner sc = new Scanner(System.in);
        Pattern num = Pattern.compile("(\\d+)([+\\-\\*\\/\\^\\%])(\\d+)");
        String resultSting = sc.nextLine().replaceAll("\\s+", "");
        Matcher matcherNum = num.matcher(resultSting);
        if (matcherNum.matches()){
            num1 = Integer.parseInt(matcherNum.group(1));
            num2 = Integer.parseInt(matcherNum.group(3));
            operation = matcherNum.group(2).charAt(0);
            if (num1 < 0 || num2 < 0){
                throw new IllegalArgumentException("Калькулятор работает с положительными числами");
            } else {
                switch (operation){
                    case '+' : result = num1 + num2; System.out.println(result); break;
                    case '-' : result = num1 - num2; System.out.println(result); break;
                    case '*' : result = num1 * num2; System.out.println(result); break;
                    case '^' : result = 1; for (int i = 1; i <= num2; i++) {
                        result = result * num1;
                    } System.out.println(result); break;
                    case '%' : result = num1 % num2; System.out.println(result); break;
                    default: System.out.println("Операция не распознана. Повторите ввод.");
                }
            }
        } else {
            System.out.println("Введенны не цифры!");
        }
    }
}