import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        try{
            String inputtedWord=InputFunction();
            if(inputtedWord.length()>200000){
                throw new WordTooLong("Inputted word is too long. ");
            }
            for(int i=0;i<inputtedWord.length();i++){
                if(Character.isLowerCase(inputtedWord.charAt(i)))
                    throw new NotUppercaseException("Inputted word is not UPPERCASE.");
            }
            File obj=getInputFile();
            if(obj==null)
                throw new InTextFileNotFound("inText.txt not found.");
            Scanner reader=makeScanner(obj);
            FileWriter fileWriter=makeFileWriter();
            readAndWrite(reader,fileWriter,inputtedWord);

        }
        catch (FileNotFoundException fnfe){ //FileNotFound-checked exception
            logger.log(Level.WARNING,"File not found:"+fnfe.getMessage());
        } catch (IOException | ArrayIndexOutOfBoundsException e) { //example of combining exceptions under one catch (IOException-checked, ArrayIndexOutOfBoundsException-unchecked)
            logger.log(Level.WARNING,e.getMessage());
        } catch(NullPointerException e){ //NullPointerException-unchecked exception
            logger.log(Level.WARNING,e.getMessage());
        } catch (NotUppercaseException e) { //Custom-made exceptions: NotUppercaseException and WordTooLong
            logger.log(Level.WARNING,e.getMessage());
        } catch (WordTooLong e){
            logger.log(Level.WARNING,e.getMessage());
        }
    }

    public static FileWriter makeFileWriter() throws IOException {
        FileWriter fileWriter=new FileWriter( "src/main/java/outText.txt");
        return fileWriter;
    }

    public static Scanner makeScanner(File obj) throws FileNotFoundException {
        Scanner reader=new Scanner(obj);
        return reader;
    }

    public static void readAndWrite(Scanner reader, FileWriter fileWriter, String inputtedWord) throws IOException {
        while(reader.hasNextLine()) {
            String S = reader.nextLine();
            fileWriter.write("From the word given, inputted word can be formed " +
                    Solution.solution(inputtedWord,S)+"x. ");
            fileWriter.write(System.getProperty( "line.separator" ));
        }
        fileWriter.close();
    }

    public static File getInputFile() {
        File obj=new File("src/main/java/inText.txt");
        return obj;
    }

    public static String InputFunction() {
        System.out.println("Type in the word you are looking for: ");
        Scanner inputWord=new Scanner(System.in);
        String inputtedWord=inputWord.nextLine();
        return inputtedWord;
    }

}
