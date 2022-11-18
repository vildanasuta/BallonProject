import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args){
        try{
            System.out.println("Type in the word you are looking for: ");
            Scanner inputWord=new Scanner(System.in);
            String inputtedWord=inputWord.nextLine();
            CheckInput.CheckInputWord(inputtedWord);
            File obj= ReadAndWrite.getInputFile();
            if(obj==null)
                throw new InTextFileNotFoundException("inText.txt not found.");
            ReadAndWrite.readAndWrite(obj,inputtedWord);
        }
        catch (FileNotFoundException fnfe){ //FileNotFound-checked exception
            logger.log(Level.WARNING,"File not found:"+fnfe.getMessage());
        } catch (IOException | ArrayIndexOutOfBoundsException e) { //example of combining exceptions under one catch (IOException-checked, ArrayIndexOutOfBoundsException-unchecked)
            logger.log(Level.WARNING,e.getMessage());
        } catch(NullPointerException e){ //NullPointerException-unchecked exception
            logger.log(Level.WARNING,e.getMessage());
        }
    }



}
