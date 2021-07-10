public class Display extends Util{
    public static void printToScreenQuestion(String quiestion){
        System.out.println(quiestion);
    }

    public static void printToScreenLesson(){
        for (int i = 0; i < listOfLessons.size(); i++) {
            System.out.println(listOfLessons.get(0));
        }
    }
}
