package calculator;

public class Calculator {
    public double doOperation(int value1, int value2, char operation){
        if (operation == '^') {
            double result = 1;
            boolean neg_flag = false;
            if (value2 < 0) {
                neg_flag = true;
                value2 = -value2;
            }
            for (int i = 0; i < value2; i++)
                result *= value1;
            if (neg_flag)
                return 1/result;
            return result;
        }else if (operation == '/')
            return (double) value1 / value2;
        else
            return (double) value1 * value2;
    }
}
