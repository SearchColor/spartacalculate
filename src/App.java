import java.util.Scanner;

public class App {
        public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        double firstN = 0;
        double secondN = 0;
        int a = 0;
        while (a < 1) {
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            String firstInput = sc.nextLine();
            while (a < 1) {
                if (isDouble(firstInput)) {
                    firstN = Double.parseDouble(firstInput);
                    calculator.setFirstNumber(firstN);
                    break;
                } else {
                    System.out.println("첫 번째 숫자를 다시 입력하세요: ");
                    firstInput = sc.nextLine();
                }
            }
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            String op = sc.nextLine();
            char operator = op.charAt(0);
            while (a < 1) {
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    calculator.setOperator(operator);
                    break;
                }else{
                    System.out.print("사칙연산 기호를 다시 입력하세요: ");
                    // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                    operator = sc.nextLine().charAt(0);
                }
            }
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            String secondInput = sc.nextLine();
            while (a < 1) {
                if(operator == '/'){
                    if (isDouble(secondInput) && !secondInput.equals("0")) {
                        secondN = Double.parseDouble(secondInput);
                        calculator.setSecondNumber(secondN);
                        break;
                    } else if (secondInput.equals("0")) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        System.out.println("두 번째 숫자를 다시 입력하세요: ");
                        secondInput = sc.nextLine();
                    } else {
                        System.out.println("두 번째 숫자를 다시 입력하세요: ");
                        secondInput = sc.nextLine();
                    }
                } else {
                    if (isDouble(secondInput)) {
                        secondN = Double.parseDouble(secondInput);
                        calculator.setSecondNumber(secondN);
                        break;
                    } else {
                        System.out.println("두 번째 숫자를 다시 입력하세요: ");
                        secondInput = sc.nextLine();
                    }
                }

            }
            System.out.println("연산 결과 : " + calculator.calculate());
            System.out.println("저장된 결과값 : " + calculator.saveResult() );

            System.out.println("계속 계산하시겠습니까? (n 입력시 종료) ");
            String conti = sc.nextLine();

            if (conti.equals("n")) {
                break;
            }

            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제) ");
            String firstDatadel = sc.nextLine();
            if(firstDatadel.equals("remove")){
                calculator.removeResult();
            }
            if (conti.equals("n")){
                break;
            }
        }
    }
    //입력받은 값이 숫자인지 파악하는 메서드
    public static boolean isDouble(String strValue) {
        try {
            Double.parseDouble(strValue);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
