package gameSelection;

import java.util.Random;
import java.util.Scanner;

import static gameSelection.GameTwo.playGameTwo;

public class GameOne {
    private static final int MIN = 0;
    private static final int MAX = 100;

    public static boolean playGameOne() {

            int min = MIN;
            int max = MAX;
            Scanner sc = new Scanner(System.in);
            Random rnd = new Random();
            int resNum = rnd.nextInt(max - min) + min;
            while (true) {
                try {
                    System.out.println("Для выхода введите \"выйти\"");
                    System.out.println("если ваше число больше введите \"больше\", если меньше введите \"меньше");
                    System.out.println("если число верно введи \"верно\".");
                    System.out.println(resNum);
                    String input = sc.nextLine();
                    if(input.equalsIgnoreCase("выйти")){
                        System.out.println("Спасибо за игру!");
                        return true;
                    }
                    if (input.equalsIgnoreCase("меньше")) {
                        max = resNum;
                        resNum = rnd.nextInt(max - min) + min;
                    } else if (input.equalsIgnoreCase("больше")) {
                        min = resNum + 1;
                        resNum = rnd.nextInt(max - min) + min;
                    } else if (input.equalsIgnoreCase("верно")) {
                        System.out.println("----------------------\n"+
                                "Мне понравилось! Спасибо за игру\n"+
                                        "----------------------\n"+
                        "Давайте сыграем в Угадать число\n"+
                                "----------------------\n");

                        playGameTwo();
                        
                        return true;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Обманывать плохо, твоё число " + resNum);
                    return true;
                }
            }
        }
    public static boolean checkRiddle(String word) {
        return word.equalsIgnoreCase("загадал");
    }
    
    
}