package gameSelection;

import java.util.InputMismatchException;
import java.util.Scanner;

import static gameSelection.ChooseGame.exitGame;
import static gameSelection.GameOne.playGameOne;


public class GameTwo {

    public static void playGameTwo()  {

        int UnknownNumber, UserNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Загадать число (от 1 до 100). \n"+
                "если хотите выйти введите 0");
        UnknownNumber = (int) Math.floor(Math.random() * 100);

        try {
            do {
                System.out.print("Введите ваше число: ");
                UserNumber = input.nextInt();

                if (UserNumber == 0) {
                    System.out.println("Спасибо за игру!");
                    exitGame();
                }
                if (UserNumber > UnknownNumber) {
                    System.out.println();
                    System.out.println("Моё число меньше.");

                } else if (UserNumber < UnknownNumber) {
                    System.out.println();
                    System.out.println("Моё число больше.");

                } else {
                    System.out.println("----------------------\n" +
                            "Поздравляю вы угадали!\n" +
                            "-----------------------\n"+
                            "Давайте сыграем в Загадать число\n"+
                            "----------------------\n");
                    playGameOne();
                }
            } while (UserNumber != UnknownNumber);
            ChooseGame.gameSelection();
        } catch (InputMismatchException e) {
            System.out.println("Нужно вводить число, попробуйте заново");
            playGameTwo();
        }

    }
}
