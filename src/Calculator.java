import java.util.Scanner;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operand;

    public void getFirstNumber() {
        firstNumber = getNumber();
    }

    public void getSecondNumber() {
        secondNumber = getNumber();
    }

    private int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public char getOperand() {
        Scanner scanner = new Scanner(System.in);
        char operand = scanner.next().charAt(0);
        return operand;
    }

    public int calculate() {
        int result=0;
        switch (operand) {
            case '*':
                result = firstNumber*secondNumber;
                break;
            case '/':
                result = firstNumber/secondNumber;
                break;
            case '+':
                result = firstNumber+secondNumber;
                break;
            case '-':
                result = firstNumber-secondNumber;
                break;
        }
        return result;
    }

    //private boolean checkOnInteger(String value) {
    //    if (value.length()==0) {
    //        return false;
    //    } else {
    //        boolean result = true;
    //        int i = 0;
    //        do {
    //            if (value.charAt(i)!=0 ||
    //                    value.charAt(i)!=1 ||
    //                    value.charAt(i)!=2 ||
    //                    value.charAt(i)!=3 ||
    //                    value.charAt(i)!=4 ||
    //                    value.charAt(i)!=5 ||
    //                    value.charAt(i)!=6 ||
    //                    value.charAt(i)!=7 ||
    //                    value.charAt(i)!=8 ||
    //                    value.charAt(i)!=9) {
    //                result = false;
    //                break;
    //            }
    //        } while (i<value.length());
    //        return result;
    //    }
    //}
}
