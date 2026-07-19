package menu;

import repository.ClassworkRepository;

import java.util.Scanner;

public class DeleteMenu {
    public static void show() {
        Scanner s = new Scanner(System.in);
        int menuChoice;

        while (true) {
            System.out.println("\n-------------------------");
            System.out.println("DELETE CLASSWORK LIST");
            System.out.println("-------------------------");
            System.out.println("MENU");
            System.out.println("[ 1 ] Delete Classwork");
            System.out.println("[ 2 ] Go Back\n");
            System.out.print("Choose from the Menu By Number : ");
            menuChoice = s.nextInt();
            System.out.println();

            int workId = 0;
            switch (menuChoice) {
                case 1-> {
                    System.out.print("Work ID : ");
                    workId = s.nextInt();
                    System.out.println("DELETED!\n");
                }
                case 2 -> {
                    return;
                }
                default -> System.out.println("\nNot in Choices!");
            }
            ClassworkRepository.delete(workId);
            ClassworkRepository.read("SELECT * FROM classwork");
        }
    }
}
