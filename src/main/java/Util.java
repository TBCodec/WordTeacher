import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Util{

    public static ArrayList<String> listOfLines = new ArrayList<String>();
    public static ArrayList<ArrayList<String>> listOfLessons = new ArrayList<ArrayList<String>>();

    public static void readFile() {
        try {
            File myObj = new File("C:\\Users\\tothb\\IdeaProjects\\Szotanito\\src\\main\\java\\szótár.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                listOfLines.add(data);
                 }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nincs fájl!");
            e.printStackTrace();
        }
    }

    public static void splitTheLessons(){
        int d = 0;
        for (int i = 0; i < listOfLines.size(); i++) {
            String data = listOfLines.get(i);
            if (listOfLines.get(i).startsWith("*")) {
                listOfLessons.add(new ArrayList<String>());
                listOfLessons.get(d).add(data);
                d++;
            }
            else {
                listOfLessons.get(d-1).add(data);
            }
        }
    }

}
