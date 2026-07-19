package classwork;

import menu.DeleteMenu;
import repository.ClassworkRepository;

public class DeleteClassworkCmd {
    public static void deleteClasswork() {
        ClassworkRepository.read("SELECT * FROM classwork");
        DeleteMenu.show();
    }
}
