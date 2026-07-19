import database.DatabaseInitializer;
import menu.MainMenu;

public class Main {
void main() {
        DatabaseInitializer.initialize();
        AppInfo.showInfo();
        MainMenu.show();
    }
}