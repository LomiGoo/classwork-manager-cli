package menu;

import repository.ClassworkRepository;

import java.util.Scanner;

public class ReadMenu {
    public static void show() {
        Scanner s = new Scanner(System.in);
        int menuChoice;

        while (true) {
            System.out.println("\n-------------------------");
            System.out.println("READ CLASSWORK LIST");
            System.out.println("-------------------------");
            System.out.println("MENU");
            System.out.println("[ 1 ] Sort By Course Name (ASC)");
            System.out.println("[ 2 ] Sort By Course Name (DESC)");
            System.out.println("[ 3 ] Sort by Date Created (ASC)");
            System.out.println("[ 4 ] Sort by Date Created (DESC)");
            System.out.println("[ 5 ] Sort by Date Target (ASC)");
            System.out.println("[ 6 ] Sort by Date Target (DESC)");
            System.out.println("[ 7 ] Sort by Status (ASC)");
            System.out.println("[ 8 ] Sort by Status (DESC)");
            System.out.println("[ 9 ] Go Back\n");
            System.out.print("Choose from the Menu By Number : ");
            menuChoice = s.nextInt();
            System.out.println();

            switch (menuChoice) {
                case 1 -> {
                    System.out.println("[ SORTED BY : ASC ]");
                    ClassworkRepository.read("SELECT * FROM classwork ORDER BY course_name ASC");
                }
                case 2 -> {
                    System.out.println("[ SORTED BY : DESC ]");
                    ClassworkRepository.read("SELECT * FROM classwork ORDER BY course_name DESC");
                }
                case 3 -> {
                    System.out.println("[ SORTED BY : ASC ]");
                    ClassworkRepository.read("SELECT * FROM classwork ORDER BY date_created ASC");
                }
                case 4 -> {
                    System.out.println("[ SORTED BY : DESC ]");
                    ClassworkRepository.read("SELECT * FROM classwork ORDER BY date_created DESC");
                }
                case 5 -> {
                    System.out.println("[ SORTED BY : ASC ]");
                    ClassworkRepository.read("SELECT * FROM classwork ORDER BY date_target ASC");
                }
                case 6 -> {
                    System.out.println("[ SORTED BY : DESC ]");
                    ClassworkRepository.read("SELECT * FROM classwork ORDER BY date_target DESC");
                }
                case 7 -> {
                    System.out.println("[ SORTED BY : ASC ]");
                    ClassworkRepository.read("SELECT * FROM classwork ORDER BY status ASC");
                }
                case 8 -> {
                    System.out.println("[ SORTED BY : DESC ]");
                    ClassworkRepository.read("SELECT * FROM classwork ORDER BY status DESC");
                }
                case 9 -> {
                    return;
                }
                default -> System.out.println("\nNot in Choices!");
            }
        }
    }
}
