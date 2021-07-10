public class Main extends Util{
    public static void main(String[] args) {
        //Display display = new Display();
        Input input = new Input();
        readFile();
        splitTheLessons();
        input.chooseLesson();
        //display.printToScreenLesson();
    }
}
