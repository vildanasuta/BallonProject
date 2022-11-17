import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WordTooLongTest {
    static Logger logger=Logger.getLogger(InTextFileNotFound.class.getName());
    @BeforeClass
    public static void startInfo(){
        logger.log(Level.INFO, "Test has started.");
    }
    @Test
    public void testConstructor() {
        WordTooLong actualWordTooLong = new WordTooLong("Inputted word is too long. ");
        assertEquals("Inputted word is too long. ", actualWordTooLong.getLocalizedMessage());
    }
    @AfterClass
    public static void endInfo(){
        logger.log(Level.INFO, "Test has ended.");
    }
}

