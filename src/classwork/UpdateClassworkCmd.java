package classwork;

import menu.UpdateMenu;
import repository.ClassworkRepository;

public class UpdateClassworkCmd {
    public static void updateClasswork() {
        ClassworkRepository.read("SELECT * FROM classwork");
        UpdateMenu.show();
    }
}
