package menu;

import repository.ClassworkRepository;

import java.util.Scanner;

public class UpdateMenu {
    public static void show() {
        Scanner s = new Scanner(System.in);
        int menuChoice;

        while (true) {
            System.out.println("\n-------------------------");
            System.out.println("UPDATE CLASSWORK LIST");
            System.out.println("-------------------------");
            System.out.println("MENU");
            System.out.println("[ 1 ] Update Course Name");
            System.out.println("[ 2 ] Update Action Description");
            System.out.println("[ 3 ] Update Date Target");
            System.out.println("[ 4 ] Update Status");
            System.out.println("[ 5 ] Exit\n");
            System.out.print("Choose from the Menu By Number : ");
            menuChoice = s.nextInt();
            System.out.println();

            int workId = 0;
            String column = null;
            String newValue = null;
            switch (menuChoice) {
                case 1 -> {
                    System.out.print("Work ID : ");
                    workId = s.nextInt();
                    s.nextLine();
                    System.out.print("New Course Name : ");
                    newValue = s.nextLine();
                    column = "cid";
                }
                case 2 -> {
                    System.out.print("Work ID : ");
                    workId = s.nextInt();
                    s.nextLine();
                    System.out.print("New Action Description : ");
                    newValue = s.nextLine();
                    column = "action_description";
                }
                case 3 -> {
                    System.out.print("Work ID : ");
                    workId = s.nextInt();
                    s.nextLine();
                    System.out.print("New Date Target : ");
                    newValue = s.nextLine();
                    column = "date_target";
                }
                case 4 -> {
                    System.out.print("Work ID : ");
                    workId = s.nextInt();
                    s.nextLine();
                    System.out.print("New Status : ");
                    newValue = s.nextLine();
                    column = "status";
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("\nNot in Choices!");
            }
            ClassworkRepository.update(workId, column, newValue);
            System.out.println();
            ClassworkRepository.read("SELECT * FROM classwork");
        }
    }
}
