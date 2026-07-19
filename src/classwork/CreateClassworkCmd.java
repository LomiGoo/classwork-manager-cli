package classwork;

import repository.ClassworkRepository;

import java.util.Scanner;

public class CreateClassworkCmd {
    public static void createClasswork() {
        Scanner s = new Scanner(System.in);

        while (true) {
            String courseName;
            String actionDescription;
            String dateTarget;

            System.out.println("---------------------------------------");
            System.out.println("CREATE NEW CLASSWORK LIST");
            System.out.println("Note : Type \"exit\" to end action.");
            System.out.println("---------------------------------------");
            do {
                System.out.print("\nCourse Name : ");
                courseName = s.nextLine();
            } while (courseName.isBlank());
            if (courseName.equalsIgnoreCase("exit")) break;

            do {
                System.out.print("\nAction Description : ");
                actionDescription = s.nextLine();
            } while (actionDescription.isBlank());
            if (actionDescription.equalsIgnoreCase("exit")) break;

            do {
                System.out.print("\nTarget Date (Type \"Null\" if not sure) : ");
                dateTarget = s.nextLine();
            } while (dateTarget.isBlank());
            if (dateTarget.equalsIgnoreCase("exit")) break;

            ClassworkRepository.create(courseName, actionDescription, dateTarget);
            System.out.println("\nAdded to DB.\n");
        }
    }
}
