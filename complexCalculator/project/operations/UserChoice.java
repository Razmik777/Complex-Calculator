package project.operations;

import java.util.Scanner;
import java.util.logging.Logger;

import project.logger.Log;
import project.model.ComplexNumber;
import project.operations.util.Addition;
import project.operations.util.Division;
import project.operations.util.Multiplication;

public class UserChoice {
    Logger log = Log.log(UserChoice.class.getName());

    Scanner input = new Scanner(System.in);

    ComplexNumber a = new ComplexNumber(3, 2);
    ComplexNumber b = new ComplexNumber(1, 5);

    public void choice() {

        log.info("Выберите действие: ");
        log.info("1. Сложение");
        log.info("2. Умножение");
        log.info("3. Деление");

        int choice = input.nextInt();

        switch (choice) {

            case 1: {
                Calculator addition = new Calculator(new Addition());
                addition.calculate(a, b);
                System.out.println("Сумма равна: " + addition.calculate(a, b));
                break;
            }
            case 2: {
                Calculator multiplication = new Calculator(new Multiplication());
                multiplication.calculate(a, b);
                System.out.println("Произведение равно: " + multiplication.calculate(a, b));
                break;
            }
            case 3: {
                Calculator division = new Calculator(new Division());
                division.calculate(a, b);
                System.out.println("Результат деления: " + division.calculate(a, b));
                break;
            }

        }
    }
}
