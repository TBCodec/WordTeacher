import java.util.Scanner;

public class Input extends Display{
    public static void chooseLesson(){
        Scanner scanner = new Scanner(System.in);
        printToScreenLesson();
        printToScreenQuestion("Melyik feladatot választod?");
        scanner.nextLine();

    }
}
