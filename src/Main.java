import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        try{
            System.out.println("Type in the word you are looking for: ");
            Scanner inputWord=new Scanner(System.in);
            String inputtedWord=inputWord.nextLine();
            if(inputtedWord.length()>200000){
                throw new WordTooLong("Inputted word is too long. ");
            }
            for(int i=0;i<inputtedWord.length();i++){
                if(Character.isLowerCase(inputtedWord.charAt(i)))
                    throw new NotUppercaseException("Inputted word is not UPPERCASE.");
            }
            File obj=new File("src\\inText.txt");
            Scanner reader=new Scanner(obj);
            FileWriter fileWriter=new FileWriter("src\\outText.txt");

            while(reader.hasNextLine()) {
              String S = reader.nextLine();
              fileWriter.write("From the word given, inputted word can be formed " +
                      Solution.solution(inputtedWord,S)+"x. ");
              fileWriter.write(System.getProperty( "line.separator" ));
            }
            fileWriter.close();
        }
        catch (FileNotFoundException fnfe){ //FileNotFound-checked exception
            logger.log(Level.WARNING,"File not found:"+fnfe.getMessage());
        } catch (IOException | ArrayIndexOutOfBoundsException e) { //example of combining exceptions under one catch (IOException-checked, ArrayIndexOutOfBoundsException-unchecked)
            logger.log(Level.WARNING,e.getMessage());
        } catch(NullPointerException e){ //NullPointerException-unchecked exception
            logger.log(Level.WARNING,e.getMessage());
        } catch (NotUppercaseException e) { //Custom made exception
            logger.log(Level.WARNING,e.getMessage());
        } catch (WordTooLong e){
            logger.log(Level.WARNING,e.getMessage());
        }
    }

}
