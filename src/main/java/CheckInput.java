import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckInput {
    static Logger logger = Logger.getLogger(CheckInput.class.getName());
    public static void CheckInputWord(String inputtedWord) {
        try {
            if (inputtedWord.length() > 200000) {
                throw new WordTooLongException("Inputted word is too long. ");
            }
            for (int i = 0; i < inputtedWord.length(); i++) {
                if (Character.isLowerCase(inputtedWord.charAt(i)))
                    throw new NotUppercaseException("Inputted word is not UPPERCASE.");
            }
        }catch (NotUppercaseException e) { //Custom-made exceptions: NotUppercaseException and WordTooLong
            logger.log(Level.WARNING,e.getMessage());
        } catch (WordTooLongException e){
            logger.log(Level.WARNING,e.getMessage());
        }
    }

}
