import java.util.Scanner;

public class MiniCalculator {
    public static void main (String[] args){

        double result = 0;
        while (true) {
            //TAKES USER INPUT & CONTINUES AND CONTINUES WHEN USER WANTS TO START AGAIN
            System.out.println(" START MATH");
            Scanner input = new Scanner(System.in);
            //FIRST VALUE INTAKE
            System.out.println("Please enter your first number : ");
            double num1 = input.nextInt();
            //SECOND VALUE INTAKE
            System.out.println("Please enter your second number : ");
            double num2 = input.nextInt();
            //OPERATOR INTAKE
            System.out.println("Please choose an operator : {+ , * , - , / , %} ");
            char operator = input.next().charAt(0);
            //SWITCH CASE PERFORMING CALCULATIONS AS METHODS
            switch (operator) {
                //ADDITION
                case '+': {result = num1 + num2;
                    System.out.println(" RESULT : " + result);
                }
                break;
                //MULTIPLICATION
                case '*': {result = num1 * num2;
                    System.out.println(" RESULT : " + result);
                }
                break;
                //SUBTRACTION
                case '-': {result = num1 - num2;
                    System.out.println(" RESULT : " + result);
                }
                break;
                //DIVISION
                case '/': {
                    if (num2 == 0) {
                        System.out.println("MATH ERROR");
                    }
                    else { result = num1 / num2;
                    }
                    System.out.println(" RESULT : " + result);
                }
                break;
                default: System.out.println("INVALID OPERATION");
            }
            //WHILE LOOP BREAK STATEMENT
          System.out.println(" Please choose Yes(y) or No(n) to quit or continue ");
            String con = input.next();
            if (con.equalsIgnoreCase("y")){
                break;

            }




        }

    }
}
