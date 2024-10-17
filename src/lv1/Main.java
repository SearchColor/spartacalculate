package lv1;

import java.util.Scanner;

public class Main {
    static class Calculate {
        // class Calculate를 생성한다.
        // -> int n1, int n2의 값을 받아와서 계산하기
        static int add (int n1, int n2) {
            return n1 + n2;
            //	더하기
        }
        static int min (int n1, int n2) {
            return n1 - n2;
            //	빼기
        }
        static int mul (int n1, int n2) {
            return n1 * n2;
            //	곱하기
        }
        static int div (int n1, int n2) {
            return n1 / n2;
            // 나누기
        }
    }


        public static void main(String[] args) {
            // 값을 받기 위해서 Scanner를 생성
            Scanner scan = new Scanner(System.in);
            // 클래스 변수 선언
            Calculate calc = new Calculate();


            // numbers
            int num1, num2;
            // operator
            char oper;
            String exit;
            // continue yes or no
            String yn;
                System.out.println("첫번째 숫자");
                // first number
                num1 = scan.nextInt();
                // operator
                // char 문자를 받을기 위해 .charAt()을 사용
                System.out.println("연산기호 (only support +, -, *, /)");
                oper = scan.next().charAt(0);
                // second number
                System.out.println("두번째 숫자");
                num2 = scan.nextInt();
                System.out.println("계속하여 계산하겠습니까? (exit입력시 종료)");


                // calculate part
                switch (oper) {
                    // add
                    case '+':
                        System.out.println("Answer -> " + num1 + " + " + num2 + " = " + Calculate.add(num1, num2));
                        break;

                    // minus1
                    case '-':
                        System.out.println("Answer -> " + num1 + " - " + num2 + " = " + Calculate.min(num1, num2));
                        break;

                    // multiple
                    case '*':
                        System.out.println("Answer -> " + num1 + " * " + num2 + " = " + Calculate.mul(num1, num2));
                        break;

                    // devide
                    case '/':
                        System.out.println("Answer -> " + num1 + " / " + num2 + " = " + Calculate.div(num1, num2));
                        break;
                }



        }

    }

