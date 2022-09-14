import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void calculate() throws Exception {
        Scanner in = new Scanner(System.in);
        String nextLine = in.nextLine();
        System.out.println(nextLine);
        String[] input = nextLine.split(" ");
        if (input.length > 3) {
            throw new Exception();
        }
        String a = input[0];
        String b = input[2];
        Calculator calculator = new Calculator(a, b);
        calculator.checkNumbers();
        int result = completeOperation(calculator, input[1]);
        if (!calculator.isRimNumbers) {
            System.out.println(result);
        } else {
            System.out.println(En.parseToEn(result));
        }

    }

    static int completeOperation(Calculator calculator, String operation) throws Exception {
        int result;
        switch (operation) {
            case "+":
                result = calculator.addition();
                break;
            case "-":
                if (!calculator.isRimNumbers) {
                    throw new Exception("Неверная операция");
                }
                result = calculator.deduction();
                break;
            case "*":
                result = calculator.multiplications();
                break;
            case "/":
                result = calculator.division();
                break;
            default:
                throw new Exception("Неверная опперация");
        }
        if (calculator.isRimNumbers && result < 1) {
            throw new Exception("Неверная опперация");
        }
        return result;
    }
}
