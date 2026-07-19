package classwork;

import menu.ReadMenu;
import repository.ClassworkRepository;

public class ReadClassworkCmd {
    public static void readClasswork() {
        ClassworkRepository.read("SELECT * FROM classwork");
        ReadMenu.show();
    }
}
