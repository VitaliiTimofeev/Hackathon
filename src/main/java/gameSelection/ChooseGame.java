package gameSelection;

import java.util.Scanner;

public class ChooseGame {
    public static void gameSelection() {
        Scanner game = new Scanner(System.in);
        System.out.print("Привет Amigo! В какую будешь играть игру?: \n" +
                ":\"Загадать число\"\n" +
                ":\"Угадать число\"\n" +
                "Напиши название игры:");
        String word = game.nextLine();
        if (word.equalsIgnoreCase("Загадать число")) {
            System.out.println("Мне она тоже нравиться, начинаем!");
            GameOne.playGameOne();
        } else if (word.equalsIgnoreCase("Угадать число")) {
            System.out.println("Отличный выбор, начинаем");
            GameTwo.playGameTwo();
        } else  {
            word.equalsIgnoreCase("Выйти");
                System.out.println("Спасибо за игру");
                exitGame();
        }
    }

    public static void exitGame() {
        System.exit(0);
    }
}



