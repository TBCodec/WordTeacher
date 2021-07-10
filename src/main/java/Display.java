    public class Display extends Util {
    public static void printToScreenQuestion(String quiestion){
        System.out.println(quiestion);
    }

    public static void printToScreenLesson(){
        for (int i = 0; i < listOfLessons.size(); i++) {
            String data = listOfLessons.get(i).get(0).replace("*", "");
            //data = String.format("%d", data);
            System.out.println(String.format("%2d", i) + " " + data);
        }
    }
}
