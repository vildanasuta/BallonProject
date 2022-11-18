import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {
    public static File getInputFile() {
        File obj=new File("src/main/java/inText.txt");
        return obj;
    }

    public static void readAndWrite(File obj, String inputtedWord) throws IOException {
        Scanner reader= new Scanner(obj);
        FileWriter fileWriter= new FileWriter( "src/main/java/outText.txt");
        while(reader.hasNextLine()) {
            String S = reader.nextLine();
            fileWriter.write("From the word given, inputted word can be formed " +
                    Solution.solution(inputtedWord,S)+"x. ");
            fileWriter.write(System.getProperty( "line.separator" ));
        }
        fileWriter.close();
    }



}
