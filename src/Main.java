import database.DatabaseInitializer;
import menu.MainMenu;

import java.util.TimeZone;

public class Main {
void main() {
        DatabaseInitializer.initialize();
        AppInfo.showInfo();
        MainMenu.show();
    }
}