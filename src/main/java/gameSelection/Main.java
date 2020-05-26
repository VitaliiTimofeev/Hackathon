package gameSelection;

public class Main {
    public static void main(String[] args) {
    System.out.println("Добрый день! Пожалуйста, зарегистрируйтесь...");
        String userName = "";
    do {
        if (userName.equals("выход"))
            ChooseGame.exitGame();
        else
            userName = Regisration.regName();
    } while (!Regisration.checkName(userName));


        ChooseGame.gameSelection();
}

}


