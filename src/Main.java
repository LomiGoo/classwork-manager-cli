import database.DatabaseInitializer;
import menu.MainMenu;

void main() {
    DatabaseInitializer.initialize();
    AppInfo.showInfo();
    MainMenu.show();
}