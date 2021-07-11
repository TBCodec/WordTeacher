import java.util.Scanner;

public class Inputs extends Main{
    public static void chooseLesson(){
        Scanner scanner = new Scanner(System.in);
        Display display = new Display();
        display.printToScreenLesson();
        display.printToScreenQuestion("\n" + "Melyik feladatot választod? 0 - " + (listOfLessons.size()-1));
        try {
            Integer choice = scanner.nextInt();
            if (validLessonInput(choice)) questioningTask = listOfLessons.get(choice);
        }
        catch (Exception e){
            System.out.println("Nem számot írtál be!");
            chooseLesson();
        }
    }

    public static String getAnswer(){
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }
}
