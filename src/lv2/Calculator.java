package lv2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Calculator {

    private double answer = 0;
    private double firstNumber;
    private double secondNumber;
    private char operator;

    Queue<Double> listQ = new LinkedList<Double>();
    Queue<Double> PrioritylistQ = new PriorityQueue<Double>();
    Stream<Double> stream = listQ.stream();

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
            listQ.offer(answer);
            PrioritylistQ.offer(answer);//결과값 queue 에 추가
            /* return 연산 결과 */
            return answer;
        }

    public void setStream(double n){
            double biggerNum ;
            stream.forEach((Double i)->{
                Math.max(i, n);
            } );
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

    //queue 처음저장된값 내보내기
    public void removeResult() {
        listQ.poll();
    }
    //queue 에 저장된 결과값들 확인
    public String saveResult(){
        return listQ.toString();
    }

    public double prioPeek(){
        return PrioritylistQ.peek();
    }

    //enum
    public enum Operator {
        PLUS("더하기", (firstNumber, secondNumber) -> (firstNumber + secondNumber)),
        MINUS("빼기", (firstNumber, secondNumber) -> (firstNumber - secondNumber)),
        MULTIPLY("곱하기", (firstNumber, secondNumber) -> (firstNumber * secondNumber)),
        DIVIDE("나누기", (firstNumber, secondNumber) -> (firstNumber / secondNumber));

        private final String name;
        private final BiFunction<Double, Double, Double> biFunction;

        Operator(String name, BiFunction<Double, Double, Double> biFunction) {
            this.name = name;
            this.biFunction = biFunction;
        }

        public Double calculate(double a, double b) {
            return this.biFunction.apply(a, b);
        }
    }
}
