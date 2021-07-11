import java.util.ArrayList;

public class Questioner extends Display{
    public static Inputs inputs = new Inputs();
    public static void questionProgram(ArrayList words){
        for (int i = 1; i < words.size(); i++) {
            String wordToString = words.get(i).toString();
            String[] data = wordToString.split("#");
            printToScreenWords(data[1]);
            if (inputs.getAnswer().equals(data[0])) System.out.println("Jó válasz!");
            else System.out.println("Nem jó!");
        }
    }
}
