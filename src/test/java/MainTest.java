import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MainTest {
    @Mock
    private ReadAndWrite rw;
    static Logger logger = Logger.getLogger(Main.class.getName());

    @BeforeClass
    public static void startInfo() {
        logger.log(Level.INFO, "Test has started.");
    }

    @Test
    void mainTest() {
        rw = mock(ReadAndWrite.class);
        File obj;
        when(rw.getInputFile()).thenReturn(obj=new File("src/main/java/inText.txt"));
        assertNotNull(obj);
    }

    @AfterClass
    public static void endInfo() {
        logger.log(Level.INFO, "Test has ended.");
    }
}