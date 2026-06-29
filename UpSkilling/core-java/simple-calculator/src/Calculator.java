import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {

    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public static void run() {

        Scanner sc = new Scanner(System.in);

        logger.info("Welcome to Calculator");

        logger.info("Enter first number: ");
        int firstNum = sc.nextInt();

        logger.info("Enter second number: ");
        int secondNum = sc.nextInt();

        logger.info("What operation do you want to perform (+, -, *, /): ");
        String oper = sc.next();

        switch (oper) {

            case "+" -> logger.log(
                    Level.INFO,
                    "The sum of {0} and {1} is {2}",
                    new Object[]{firstNum, secondNum, firstNum + secondNum}
            );

            case "-" -> logger.log(
                    Level.INFO,
                    "The difference of {0} and {1} is {2}",
                    new Object[]{firstNum, secondNum, firstNum - secondNum}
            );

            case "*" -> logger.log(
                    Level.INFO,
                    "The multiplication of {0} and {1} is {2}",
                    new Object[]{firstNum, secondNum, firstNum * secondNum}
            );

            case "/" -> {
                if (secondNum == 0) {
                    logger.warning("Cannot divide by zero.");
                } else {
                    logger.log(
                            Level.INFO,
                            "The division of {0} by {1} is {2}",
                            new Object[]{
                                    firstNum,
                                    secondNum,
                                    (double) firstNum / secondNum
                            }
                    );
                }
            }

            default -> logger.warning("Invalid operator entered.");
        }

        sc.close();
    }
}