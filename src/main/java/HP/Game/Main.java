package HP.Game;

import HP.Game.Game;

public class Main {
    public static void main(String[] args) {
        boolean Jeu = true;
        while (Jeu) {
            new Game().StartGame();
            Jeu = false;
        }
    }
}