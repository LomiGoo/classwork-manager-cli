package menu;

import classwork.CreateClassworkCmd;
import classwork.DeleteClassworkCmd;
import classwork.ReadClassworkCmd;
import classwork.UpdateClassworkCmd;

import java.util.Scanner;

public class MainMenu {
    public static void show() {
        Scanner s = new Scanner(System.in);
        int menuChoice;

        while (true) {
            System.out.println("-------------------------");
            System.out.println("CLASSWORK MANAGER");
            System.out.println("-------------------------");
            System.out.println("MENU");
            System.out.println("[ 1 ] Create Classwork List");
            System.out.println("[ 2 ] Read Classwork List");
            System.out.println("[ 3 ] Update Classwork List");
            System.out.println("[ 4 ] Delete Classwork List");
            System.out.println("[ 5 ] Exit\n");
            System.out.print("Choose from the Menu By Number : ");
            menuChoice = s.nextInt();
            System.out.println();

            switch (menuChoice) {
                case 1 -> CreateClassworkCmd.createClasswork();
                case 2 -> ReadClassworkCmd.readClasswork();
                case 3 -> UpdateClassworkCmd.updateClasswork();
                case 4 -> DeleteClassworkCmd.deleteClasswork();
                case 5 -> {
                    return;
                }
                default -> System.out.println("\nNot in Choices!");
            }
        }
    }
}
