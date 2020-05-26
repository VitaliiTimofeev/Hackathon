package gameSelection;

import java.util.Scanner;

public class Regisration {
    private static String regName = "";

    public static boolean checkName(String name) {
        if (name.equals("")) {
            System.out.println("Имя не должно быть пустым, попробуйте ещё раз");
            return false;
        }
        if (name.equalsIgnoreCase("выйти")) {
            System.out.println("Возращайтесь обратно, до скорых встреч");
            System.exit(0);
        } else if (name.matches(".*\\d.*")) {
            System.out.println("Имя не должно стостоять из цифр, попробуйте ещё раз");
            return false;
        } else if (name.contains(" ")) {
            System.out.println("Имя не должно быть из двух слов ");
            return false;
        } else
            System.out.println("Добро пожаловать " + name.substring(0, 1).toUpperCase() + name.substring(1));
        return true;
    }

    public static String regName() {
        System.out.println("Введите имя: \n" +
                "или можете написать\"выйти\" для выхода из игры");
        return new Scanner(System.in).nextLine();
    }
}

