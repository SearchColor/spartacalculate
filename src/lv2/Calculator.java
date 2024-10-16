package lv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.BiFunction;

public class Calculator {

    private double answer = 0;
    private double firstNumber;
    private double secondNumber;
    private char operator;

    Queue<Double> listQ = new LinkedList<>();

        public double calculate() {
            /* 위 요구사항에 맞게 구현 */
            if (operator =='+'){
                answer = Operator.PLUS.calculate(firstNumber,secondNumber);
            } else if (operator == '-') {
                answer = Operator.MINUS.calculate(firstNumber,secondNumber);
            } else if (operator == '*') {
                answer = Operator.MULTIPLY.calculate(firstNumber,secondNumber);
            } else if (operator == '/') {
                answer = Operator.DIVIDE.calculate(firstNumber,secondNumber);
            }
            listQ.add(answer);
            /* return 연산 결과 */
            return answer;
        }


    //setter
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void removeResult() {
        listQ.poll();
    }
    public String saveResult(){
        return listQ.toString();
    }

    //enum
    public enum Operator {
        PLUS("더하기", (firstNumber, secondNumber) -> (firstNumber + secondNumber)),
        MINUS("빼기", (firstNumber, secondNumber) -> (firstNumber - secondNumber)),
        MULTIPLY("곱하기",(firstNumber, secondNumber) -> (firstNumber * secondNumber)),
        DIVIDE("나누기", (firstNumber, secondNumber) -> (firstNumber / secondNumber));

        private final String name;
        private final BiFunction<Double, Double, Double> biFunction;

        Operator(String name, BiFunction<Double, Double, Double> biFunction) {
            this.name = name;
            this.biFunction = biFunction;
        }

        public Double calculate(double a, double b) {
            return this.biFunction.apply(a,b);
        }
    }



}
