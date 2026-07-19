public class AppInfo {
    public static final String VERSION = "2.1.0";
    public static final String AUTHOR = "LomiGoo";
    public static final String GITHUB_PROFILE = "https://github.com/LomiGoo";
    public static final String PROJECT_SOURCE_CODE = "https://github.com/LomiGoo/classwork-manager-cli";

    private AppInfo() {}
    public static void showInfo() {
        System.out.println("\nClasswork Manager Version : " + VERSION);
        System.out.println("Author : " + AUTHOR);
        System.out.println("GitHub Profile : " + GITHUB_PROFILE);
        System.out.println("Project Source Code : " + PROJECT_SOURCE_CODE);
        System.out.println();
    }
}
