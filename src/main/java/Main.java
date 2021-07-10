import java.util.ArrayList;

public class Main extends Util{
    public static ArrayList questioningTask;
    public static void main(String[] args) {
        Inputs input = new Inputs();
        readFile();
        splitTheLessons();
        input.chooseLesson();
        System.out.println(questioningTask);
    }
}
